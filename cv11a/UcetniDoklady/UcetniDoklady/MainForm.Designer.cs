namespace UcetniDoklady
{
    partial class MainForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lbxDoklady = new System.Windows.Forms.ListBox();
            this.lblDoklady = new System.Windows.Forms.Label();
            this.lblZauctovaneDoklady = new System.Windows.Forms.Label();
            this.lbxZauctovaneDoklady = new System.Windows.Forms.ListBox();
            this.btZauctuj = new System.Windows.Forms.Button();
            this.btReport = new System.Windows.Forms.Button();
            this.chcbShowDPH = new System.Windows.Forms.CheckBox();
            this.chcbShowDatum = new System.Windows.Forms.CheckBox();
            this.chcbShowTypPUFU = new System.Windows.Forms.CheckBox();
            this.btReportAllSelected = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbxDoklady
            // 
            this.lbxDoklady.FormattingEnabled = true;
            this.lbxDoklady.Location = new System.Drawing.Point(13, 29);
            this.lbxDoklady.Name = "lbxDoklady";
            this.lbxDoklady.Size = new System.Drawing.Size(193, 407);
            this.lbxDoklady.TabIndex = 0;
            // 
            // lblDoklady
            // 
            this.lblDoklady.AutoSize = true;
            this.lblDoklady.Location = new System.Drawing.Point(13, 10);
            this.lblDoklady.Name = "lblDoklady";
            this.lblDoklady.Size = new System.Drawing.Size(46, 13);
            this.lblDoklady.TabIndex = 1;
            this.lblDoklady.Text = "Doklady";
            // 
            // lblZauctovaneDoklady
            // 
            this.lblZauctovaneDoklady.AutoSize = true;
            this.lblZauctovaneDoklady.Location = new System.Drawing.Point(647, 7);
            this.lblZauctovaneDoklady.Name = "lblZauctovaneDoklady";
            this.lblZauctovaneDoklady.Size = new System.Drawing.Size(105, 13);
            this.lblZauctovaneDoklady.TabIndex = 3;
            this.lblZauctovaneDoklady.Text = "Zaúčtované doklady";
            // 
            // lbxZauctovaneDoklady
            // 
            this.lbxZauctovaneDoklady.FormattingEnabled = true;
            this.lbxZauctovaneDoklady.Location = new System.Drawing.Point(647, 29);
            this.lbxZauctovaneDoklady.Name = "lbxZauctovaneDoklady";
            this.lbxZauctovaneDoklady.Size = new System.Drawing.Size(193, 407);
            this.lbxZauctovaneDoklady.TabIndex = 2;
            // 
            // btZauctuj
            // 
            this.btZauctuj.Location = new System.Drawing.Point(227, 62);
            this.btZauctuj.Name = "btZauctuj";
            this.btZauctuj.Size = new System.Drawing.Size(103, 47);
            this.btZauctuj.TabIndex = 4;
            this.btZauctuj.Text = "Zaúčtování dokladu";
            this.btZauctuj.UseVisualStyleBackColor = true;
            this.btZauctuj.Click += new System.EventHandler(this.btZauctuj_Click);
            // 
            // btReport
            // 
            this.btReport.Location = new System.Drawing.Point(227, 115);
            this.btReport.Name = "btReport";
            this.btReport.Size = new System.Drawing.Size(103, 42);
            this.btReport.TabIndex = 5;
            this.btReport.Text = "Report dokladu";
            this.btReport.UseVisualStyleBackColor = true;
            this.btReport.Click += new System.EventHandler(this.btReport_Click);
            // 
            // chcbShowDPH
            // 
            this.chcbShowDPH.AutoSize = true;
            this.chcbShowDPH.Location = new System.Drawing.Point(418, 29);
            this.chcbShowDPH.Name = "chcbShowDPH";
            this.chcbShowDPH.Size = new System.Drawing.Size(79, 17);
            this.chcbShowDPH.TabIndex = 6;
            this.chcbShowDPH.Text = "Show DPH";
            this.chcbShowDPH.UseVisualStyleBackColor = true;
            // 
            // chcbShowDatum
            // 
            this.chcbShowDatum.AutoSize = true;
            this.chcbShowDatum.Location = new System.Drawing.Point(418, 52);
            this.chcbShowDatum.Name = "chcbShowDatum";
            this.chcbShowDatum.Size = new System.Drawing.Size(85, 17);
            this.chcbShowDatum.TabIndex = 7;
            this.chcbShowDatum.Text = "Show datum";
            this.chcbShowDatum.UseVisualStyleBackColor = true;
            // 
            // chcbShowTypPUFU
            // 
            this.chcbShowTypPUFU.AutoSize = true;
            this.chcbShowTypPUFU.Location = new System.Drawing.Point(418, 75);
            this.chcbShowTypPUFU.Name = "chcbShowTypPUFU";
            this.chcbShowTypPUFU.Size = new System.Drawing.Size(105, 17);
            this.chcbShowTypPUFU.TabIndex = 8;
            this.chcbShowTypPUFU.Text = "Show typ PÚ FÚ";
            this.chcbShowTypPUFU.UseVisualStyleBackColor = true;
            // 
            // btReportAllSelected
            // 
            this.btReportAllSelected.Location = new System.Drawing.Point(227, 163);
            this.btReportAllSelected.Name = "btReportAllSelected";
            this.btReportAllSelected.Size = new System.Drawing.Size(103, 42);
            this.btReportAllSelected.TabIndex = 9;
            this.btReportAllSelected.Text = "Report vých dokladů";
            this.btReportAllSelected.UseVisualStyleBackColor = true;
            this.btReportAllSelected.Click += new System.EventHandler(this.btReportAllSelected_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(852, 478);
            this.Controls.Add(this.btReportAllSelected);
            this.Controls.Add(this.chcbShowTypPUFU);
            this.Controls.Add(this.chcbShowDatum);
            this.Controls.Add(this.chcbShowDPH);
            this.Controls.Add(this.btReport);
            this.Controls.Add(this.btZauctuj);
            this.Controls.Add(this.lblZauctovaneDoklady);
            this.Controls.Add(this.lbxZauctovaneDoklady);
            this.Controls.Add(this.lblDoklady);
            this.Controls.Add(this.lbxDoklady);
            this.Name = "Form1";
            this.Text = "Účetní doklady";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.ListBox lbxDoklady;
        private System.Windows.Forms.Label lblDoklady;
        private System.Windows.Forms.Label lblZauctovaneDoklady;
        private System.Windows.Forms.ListBox lbxZauctovaneDoklady;
        private System.Windows.Forms.Button btZauctuj;
        private System.Windows.Forms.Button btReport;
        private System.Windows.Forms.CheckBox chcbShowDPH;
        private System.Windows.Forms.CheckBox chcbShowDatum;
        private System.Windows.Forms.CheckBox chcbShowTypPUFU;
        private System.Windows.Forms.Button btReportAllSelected;
    }
}

