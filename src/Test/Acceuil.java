package Test;

import javax.swing.JTabbedPane;

public class Acceuil extends javax.swing.JFrame {

    public Acceuil() {
         initComponents();
        view=new javax.swing.JMenu();
        help=new javax.swing.JMenu();
        view.setText("View");
        menu_bar.add(view);
        help.setText("Help");
        menu_bar.add(help);
        
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_general = new javax.swing.JPanel();
        tab_general = new javax.swing.JTabbedPane();
        panelProfil = new javax.swing.JPanel();
        nomCompletlabel = new javax.swing.JLabel();
        login_label = new javax.swing.JLabel();
        passwdLabel = new javax.swing.JLabel();
        mail_Label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nomCompletText = new javax.swing.JTextField();
        loginText = new javax.swing.JTextField();
        mailText = new javax.swing.JTextField();
        passwdText = new javax.swing.JPasswordField();
        panelAdherent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        triCombox = new javax.swing.JComboBox();
        serachText = new javax.swing.JTextField();
        serachBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        adhrentTable = new javax.swing.JTable();
        panelReclamations = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        leftSplitPanel = new javax.swing.JPanel();
        tab_reclamation = new javax.swing.JTabbedPane();
        reclamation_tab_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        consulter_DetailsBtn = new javax.swing.JButton();
        supprimer_detailsBtn = new javax.swing.JButton();
        suggestion_tabPanel = new javax.swing.JPanel();
        rightSplitPanel = new javax.swing.JPanel();
        tabDetailsReclamation = new javax.swing.JTabbedPane();
        DemandeurPanel = new javax.swing.JPanel();
        accusePanel = new javax.swing.JPanel();
        contexterecPanel = new javax.swing.JPanel();
        panelStatistique = new javax.swing.JPanel();
        panelRapport = new javax.swing.JPanel();
        panelFAQ = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        leftSplitFAQ = new javax.swing.JPanel();
        triComboFAQ = new javax.swing.JComboBox();
        serachTextFAQ = new javax.swing.JTextField();
        searchFAQBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableau_FAQ = new javax.swing.JTable();
        rightSplitFAQ = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        menu_bar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProfil.setBackground(new java.awt.Color(204, 255, 204));

        nomCompletlabel.setText("Nom Complet :");

        login_label.setText("Login :");

        passwdLabel.setText("Password :");

        mail_Label.setText("E_mail :");

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 14)); // NOI18N
        jLabel1.setText("General Setting ");

        nomCompletText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomCompletTextActionPerformed(evt);
            }
        });

        mailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTextActionPerformed(evt);
            }
        });

        passwdText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwdTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProfilLayout = new javax.swing.GroupLayout(panelProfil);
        panelProfil.setLayout(panelProfilLayout);
        panelProfilLayout.setHorizontalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProfilLayout.createSequentialGroup()
                        .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProfilLayout.createSequentialGroup()
                                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(mail_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwdLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))
                                .addGap(33, 33, 33)
                                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nomCompletText)
                                    .addComponent(loginText)
                                    .addComponent(mailText)
                                    .addComponent(passwdText, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                            .addComponent(nomCompletlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(823, Short.MAX_VALUE))
                    .addGroup(panelProfilLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 876, Short.MAX_VALUE))))
        );
        panelProfilLayout.setVerticalGroup(
            panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfilLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomCompletlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomCompletText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwdText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelProfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mail_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        tab_general.addTab("Mon Profil", panelProfil);

        panelAdherent.setBackground(new java.awt.Color(153, 204, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Liste des utilisateurs");

        triCombox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trier Par", "Nom", "Prenom", "UserName", "Date d'inscription" }));
        triCombox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                triComboxActionPerformed(evt);
            }
        });

        serachText.setText("Search....");

        serachBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_icon.jpg"))); // NOI18N

        adhrentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"saadani","Majdi","chbaya7","02/03/2013"},
                {"ben mansour","Safouene","3angour","15/09/2013"},
                {"torjmen", "Salma","salmouch","29/12/2013"},
                {"ayed", "Olfa", "foufa","01/01/2014"},
                {"yaakoubi", "Sinda","chouchou","05/02/2014"}

            },
            new String [] {
                "Nom", "Prenom", "UserName", "Date d'inscription"
            }
        ));
        jScrollPane1.setViewportView(adhrentTable);

        javax.swing.GroupLayout panelAdherentLayout = new javax.swing.GroupLayout(panelAdherent);
        panelAdherent.setLayout(panelAdherentLayout);
        panelAdherentLayout.setHorizontalGroup(
            panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdherentLayout.createSequentialGroup()
                .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAdherentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdherentLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(triCombox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachText, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAdherentLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(561, Short.MAX_VALUE))
        );
        panelAdherentLayout.setVerticalGroup(
            panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdherentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serachBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAdherentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(serachText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(triCombox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        tab_general.addTab("Consulter info Adherent", panelAdherent);

        panelReclamations.setBackground(new java.awt.Color(255, 204, 204));

        jSplitPane2.setDividerLocation(400);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setOneTouchExpandable(true);

        leftSplitPanel.setBackground(new java.awt.Color(153, 204, 255));
        leftSplitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des reclamations"));

        reclamation_tab_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des reclamation"));

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Reclamations 1", "Reclamations 2", "Reclamations 3", "Reclamations 4", "Reclamations 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        consulter_DetailsBtn.setText("Consulter détails");

        supprimer_detailsBtn.setText("Supprimer");
        supprimer_detailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_detailsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reclamation_tab_panelLayout = new javax.swing.GroupLayout(reclamation_tab_panel);
        reclamation_tab_panel.setLayout(reclamation_tab_panelLayout);
        reclamation_tab_panelLayout.setHorizontalGroup(
            reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                .addGroup(reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(consulter_DetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(supprimer_detailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        reclamation_tab_panelLayout.setVerticalGroup(
            reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reclamation_tab_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(reclamation_tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consulter_DetailsBtn)
                    .addComponent(supprimer_detailsBtn))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        tab_reclamation.addTab("Reclamations", reclamation_tab_panel);

        javax.swing.GroupLayout suggestion_tabPanelLayout = new javax.swing.GroupLayout(suggestion_tabPanel);
        suggestion_tabPanel.setLayout(suggestion_tabPanelLayout);
        suggestion_tabPanelLayout.setHorizontalGroup(
            suggestion_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 382, Short.MAX_VALUE)
        );
        suggestion_tabPanelLayout.setVerticalGroup(
            suggestion_tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );

        tab_reclamation.addTab("Suggestions", suggestion_tabPanel);

        javax.swing.GroupLayout leftSplitPanelLayout = new javax.swing.GroupLayout(leftSplitPanel);
        leftSplitPanel.setLayout(leftSplitPanelLayout);
        leftSplitPanelLayout.setHorizontalGroup(
            leftSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_reclamation)
        );
        leftSplitPanelLayout.setVerticalGroup(
            leftSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_reclamation)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(leftSplitPanel);

        rightSplitPanel.setBackground(new java.awt.Color(0, 153, 153));
        rightSplitPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Détails Reclamations"));

        DemandeurPanel.setBackground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout DemandeurPanelLayout = new javax.swing.GroupLayout(DemandeurPanel);
        DemandeurPanel.setLayout(DemandeurPanelLayout);
        DemandeurPanelLayout.setHorizontalGroup(
            DemandeurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        DemandeurPanelLayout.setVerticalGroup(
            DemandeurPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Demandeur", DemandeurPanel);

        accusePanel.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout accusePanelLayout = new javax.swing.GroupLayout(accusePanel);
        accusePanel.setLayout(accusePanelLayout);
        accusePanelLayout.setHorizontalGroup(
            accusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 631, Short.MAX_VALUE)
        );
        accusePanelLayout.setVerticalGroup(
            accusePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Accusé", accusePanel);

        contexterecPanel.setBackground(new java.awt.Color(240, 216, 11));
        contexterecPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout contexterecPanelLayout = new javax.swing.GroupLayout(contexterecPanel);
        contexterecPanel.setLayout(contexterecPanelLayout);
        contexterecPanelLayout.setHorizontalGroup(
            contexterecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        contexterecPanelLayout.setVerticalGroup(
            contexterecPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 409, Short.MAX_VALUE)
        );

        tabDetailsReclamation.addTab("Contexte Reclamations", contexterecPanel);

        javax.swing.GroupLayout rightSplitPanelLayout = new javax.swing.GroupLayout(rightSplitPanel);
        rightSplitPanel.setLayout(rightSplitPanelLayout);
        rightSplitPanelLayout.setHorizontalGroup(
            rightSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDetailsReclamation)
        );
        rightSplitPanelLayout.setVerticalGroup(
            rightSplitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabDetailsReclamation)
        );

        tabDetailsReclamation.setTabPlacement(JTabbedPane.LEFT);

        jSplitPane2.setRightComponent(rightSplitPanel);

        javax.swing.GroupLayout panelReclamationsLayout = new javax.swing.GroupLayout(panelReclamations);
        panelReclamations.setLayout(panelReclamationsLayout);
        panelReclamationsLayout.setHorizontalGroup(
            panelReclamationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        panelReclamationsLayout.setVerticalGroup(
            panelReclamationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        tab_general.addTab("Gérer Reclamations", panelReclamations);

        panelStatistique.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout panelStatistiqueLayout = new javax.swing.GroupLayout(panelStatistique);
        panelStatistique.setLayout(panelStatistiqueLayout);
        panelStatistiqueLayout.setHorizontalGroup(
            panelStatistiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1059, Short.MAX_VALUE)
        );
        panelStatistiqueLayout.setVerticalGroup(
            panelStatistiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        tab_general.addTab("Génerer les statistiques", panelStatistique);

        panelRapport.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panelRapportLayout = new javax.swing.GroupLayout(panelRapport);
        panelRapport.setLayout(panelRapportLayout);
        panelRapportLayout.setHorizontalGroup(
            panelRapportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1059, Short.MAX_VALUE)
        );
        panelRapportLayout.setVerticalGroup(
            panelRapportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        tab_general.addTab("Générer Rapport", panelRapport);

        panelFAQ.setBackground(new java.awt.Color(204, 255, 255));

        jSplitPane1.setDividerLocation(350);
        jSplitPane1.setDividerSize(8);
        jSplitPane1.setOneTouchExpandable(true);

        leftSplitFAQ.setBackground(new java.awt.Color(27, 183, 105));
        leftSplitFAQ.setBorder(javax.swing.BorderFactory.createTitledBorder("Gestion des FAQ"));

        triComboFAQ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        serachTextFAQ.setText("Search....");
        serachTextFAQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachTextFAQActionPerformed(evt);
            }
        });

        tableau_FAQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"objet 1","10/10/2013","1"},
                {"objet 2","10/10/2013","1",},
                {"objet 3","10/10/2013","1"},
                {"Objet 4","10/10/2013","1"}
            },
            new String [] {
                "Objet", "Date de Creation", "Nbr de question"
            }
        ));
        jScrollPane3.setViewportView(tableau_FAQ);

        javax.swing.GroupLayout leftSplitFAQLayout = new javax.swing.GroupLayout(leftSplitFAQ);
        leftSplitFAQ.setLayout(leftSplitFAQLayout);
        leftSplitFAQLayout.setHorizontalGroup(
            leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitFAQLayout.createSequentialGroup()
                .addGroup(leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftSplitFAQLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(triComboFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serachTextFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFAQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftSplitFAQLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        leftSplitFAQLayout.setVerticalGroup(
            leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftSplitFAQLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(leftSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(triComboFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serachTextFAQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFAQBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(leftSplitFAQ);

        javax.swing.GroupLayout rightSplitFAQLayout = new javax.swing.GroupLayout(rightSplitFAQ);
        rightSplitFAQ.setLayout(rightSplitFAQLayout);
        rightSplitFAQLayout.setHorizontalGroup(
            rightSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        rightSplitFAQLayout.setVerticalGroup(
            rightSplitFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(rightSplitFAQ);

        javax.swing.GroupLayout panelFAQLayout = new javax.swing.GroupLayout(panelFAQ);
        panelFAQ.setLayout(panelFAQLayout);
        panelFAQLayout.setHorizontalGroup(
            panelFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        panelFAQLayout.setVerticalGroup(
            panelFAQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        tab_general.addTab("Génerer FAQ", panelFAQ);

        javax.swing.GroupLayout panel_generalLayout = new javax.swing.GroupLayout(panel_general);
        panel_general.setLayout(panel_generalLayout);
        panel_generalLayout.setHorizontalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_generalLayout.createSequentialGroup()
                .addComponent(tab_general, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_generalLayout.setVerticalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_general)
        );

        tab_general.setTabPlacement(JTabbedPane.LEFT);

        jToggleButton1.setText("jToggleButton1");

        jMenu1.setText("File");
        menu_bar.add(jMenu1);

        jMenu2.setText("Edit");
        menu_bar.add(jMenu2);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_general, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomCompletTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomCompletTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomCompletTextActionPerformed

    private void mailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTextActionPerformed

    private void passwdTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwdTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwdTextActionPerformed

    private void triComboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_triComboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_triComboxActionPerformed

    private void supprimer_detailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_detailsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supprimer_detailsBtnActionPerformed

    private void serachTextFAQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachTextFAQActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serachTextFAQActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
                System.out.println();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DemandeurPanel;
    private javax.swing.JPanel accusePanel;
    private javax.swing.JTable adhrentTable;
    private javax.swing.JButton consulter_DetailsBtn;
    private javax.swing.JPanel contexterecPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel leftSplitFAQ;
    private javax.swing.JPanel leftSplitPanel;
    private javax.swing.JTextField loginText;
    private javax.swing.JLabel login_label;
    private javax.swing.JTextField mailText;
    private javax.swing.JLabel mail_Label;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JTextField nomCompletText;
    private javax.swing.JLabel nomCompletlabel;
    private javax.swing.JPanel panelAdherent;
    private javax.swing.JPanel panelFAQ;
    private javax.swing.JPanel panelProfil;
    private javax.swing.JPanel panelRapport;
    private javax.swing.JPanel panelReclamations;
    private javax.swing.JPanel panelStatistique;
    private javax.swing.JPanel panel_general;
    private javax.swing.JLabel passwdLabel;
    private javax.swing.JPasswordField passwdText;
    private javax.swing.JPanel reclamation_tab_panel;
    private javax.swing.JPanel rightSplitFAQ;
    private javax.swing.JPanel rightSplitPanel;
    private javax.swing.JButton searchFAQBtn;
    private javax.swing.JButton serachBtn;
    private javax.swing.JTextField serachText;
    private javax.swing.JTextField serachTextFAQ;
    private javax.swing.JPanel suggestion_tabPanel;
    private javax.swing.JButton supprimer_detailsBtn;
    private javax.swing.JTabbedPane tabDetailsReclamation;
    private javax.swing.JTabbedPane tab_general;
    private javax.swing.JTabbedPane tab_reclamation;
    private javax.swing.JTable tableau_FAQ;
    private javax.swing.JComboBox triComboFAQ;
    private javax.swing.JComboBox triCombox;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JMenu view;
    private  javax.swing.JMenu help;
}
