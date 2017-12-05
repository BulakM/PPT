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
    public partial class MainForm : Form
    {
        List<Data.Doklad> lDoklady = new List<Data.Doklad>();
        List<Data.ZauctovaniDokladu> lDokladyZauctovane = new List<Data.ZauctovaniDokladu>();


        public MainForm()
        {
            InitializeComponent();
            lDoklady.Add(new Data.Doklad("1", DateTime.Now.AddDays(-1), 400, "Vydajovy_doklad", "Faktura"));
            lDoklady.Add(new Data.Doklad("2", DateTime.Now, 600, "Vydajovy_doklad", "Faktura"));
            lDoklady.Add(new Data.Doklad("3", DateTime.Now, 100, "Vydajovy_doklad", "Faktura"));
        }

        private void btZauctuj_Click(object sender, EventArgs e)
        {
            Data.ZauctovaniDokladu zauct = new Data.ZauctovaniDokladu("MM", DateTime.Now, (Data.Doklad)lbxDoklady.SelectedItem);
            try
            {
                zauct.Zauctuj();

                lDokladyZauctovane.Add(zauct);
                RefreshDataSource();
            }
            catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            RefreshDataSource();
        }

        private void RefreshDataSource()
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
                reportPDF.Append("sazbaDPH;");
            reportPDF.Append("Typ dokladu");
            reportPDF.AppendLine();

            CreateTemplateForReport(ref reportPDF, dkld, ";");

            reportPDF.Append(dkld.Typ);
            reportPDF.Append(";");

            Console.WriteLine(reportPDF.ToString());
        }

        private void btReportAllSelected_Click(object sender, EventArgs e)
        {
            StringBuilder reportPDF = new StringBuilder();

            foreach (Data.Doklad dkld in lbxDoklady.SelectedItems)
            {
                CreateTemplateForReport(ref reportPDF, dkld, "\t");
                reportPDF.AppendLine("");
            }
        }

        private void CreateTemplateForReport(ref StringBuilder reportPDF, Data.Doklad dkld, string sign)
        {
            reportPDF.Append(dkld.CisloDokladu);
            reportPDF.Append(sign);
            if (chcbShowDatum.Checked)
            {
                reportPDF.Append(dkld.Datum_Vystaveni);
                reportPDF.Append(sign);
                reportPDF.Append(dkld.Datum_Splanosti);
                reportPDF.Append(sign);
            }
            reportPDF.Append(dkld.CenaSDPH);
            reportPDF.Append(sign);
            if (chcbShowDPH.Checked)
            {
                reportPDF.Append(dkld.SazbaDPH);
                reportPDF.Append(sign);
            }
        }
    }
}
