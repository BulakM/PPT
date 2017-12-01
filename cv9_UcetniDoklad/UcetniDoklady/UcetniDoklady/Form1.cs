using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace UcetniDoklady
{
    public partial class Form1 : Form
    {
        List<Data.Doklad> lDoklady = new List<Data.Doklad>();
        List<Data.Zauctovani> lDokladyZauctovane = new List<Data.Zauctovani>();


        public Form1()
        {
            InitializeComponent();
        }

        private void btZauctuj_Click(object sender, EventArgs e)
        {
            Data.Zauctovani zauct = new Data.Zauctovani("MM", DateTime.Now, (Data.Doklad)lbxDoklady.SelectedItem);
            try
            {
                zauct.Zauctuj();

                lDokladyZauctovane.Add(zauct);
                lbxZauctovaneDoklady.DataSource = null;
                lbxZauctovaneDoklady.DataSource = lDokladyZauctovane;
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lbxDoklady.DataSource = null;
            lbxDoklady.DataSource = lDoklady;

            lbxZauctovaneDoklady.DataSource = null;
            lbxZauctovaneDoklady.DataSource = lDokladyZauctovane;
        }

        private void btReport_Click(object sender, EventArgs e)
        {
            StringBuilder reportPDF = new StringBuilder();
            Data.Doklad dkld = (Data.Doklad) lbxDoklady.SelectedItem;

            reportPDF.Append("Číslo dokladu;");
            if (chcbShowDatum.Checked)
                reportPDF.Append("datum vystavení;datum splatnosti;");
            reportPDF.Append("cena s dph;");
            if (chcbShowDPH.Checked)
                reportPDF.Append("sazbaDPH");
            reportPDF.AppendLine();

            reportPDF.Append(dkld.CisloDokladu);
            reportPDF.Append(";");
            if (chcbShowDatum.Checked)
            {
                reportPDF.Append(dkld.Datum_Vystaveni);
                reportPDF.Append(";");
                reportPDF.Append(dkld.Datum_Splanosti);
                reportPDF.Append(";");
            }
            reportPDF.Append(dkld.CenaSDPH);
            reportPDF.Append(";");
            if (chcbShowDPH.Checked)
            {
                reportPDF.Append(dkld.SazbaDPH);
                reportPDF.Append(";");
            }         
        }

        private void btReportAllSelected_Click(object sender, EventArgs e)
        {
            StringBuilder reportPDF = new StringBuilder();

            foreach (Data.Doklad dkld in lbxDoklady.SelectedItems)
            {
                reportPDF.Append(dkld.CisloDokladu);
                reportPDF.Append("\t");
                if (chcbShowDatum.Checked)
                {
                    reportPDF.Append(dkld.Datum_Vystaveni);
                    reportPDF.Append("\t");
                    reportPDF.Append(dkld.Datum_Splanosti);
                    reportPDF.Append("\t");
                }
                reportPDF.Append(dkld.CenaSDPH);
                reportPDF.Append("\t");
                if (chcbShowDPH.Checked)
                {
                    reportPDF.Append(dkld.SazbaDPH);
                    reportPDF.Append("\t");
                }
                reportPDF.AppendLine("");
            }
        }
    }
}
