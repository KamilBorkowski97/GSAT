package gsat;
import java.awt.Color;
import java.util.*;
import org.apache.commons.jexl2.*; // używamy biblioteki jexl2, potrzebne biblioteki: commons-jexl-2.1.1.jar i commons-logging-1.2.jar

/**
 *
 * @author Kamil&&Marcin
 */
public class Window extends javax.swing.JFrame {

    
  //static int HowManyRestarts = 19;        //ile razy chcemy dodatkowo randomizować w przypadku nie znalezienia spełnienia
  int HowManyRestarts;
  boolean showAlgorithm = false;   //zmień w zależności czy chcesz zobaczyć działanie programu
  Color cfocus = new Color(120,120,200);
  Color clost = new Color(240,240,240);
  
    public Window() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtfformula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfzmienne = new javax.swing.JTextField();
        jtfpodFormuly = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbSprawdz = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfroz = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jtfiloscrand = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(81, 182, 217));

        jtfformula.setToolTipText("np. (p||q)&&r");
        jtfformula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfformulaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfformulaFocusLost(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Podaj formule : ");

        jtfzmienne.setToolTipText("");
        jtfzmienne.setEnabled(false);

        jtfpodFormuly.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Zmienne :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Podformuly:");

        jbSprawdz.setText("Sprawdź");
        jbSprawdz.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jbSprawdz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSprawdzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSprawdzMouseExited(evt);
            }
        });
        jbSprawdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSprawdzActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Formula spełniona dla:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Rozwiązanie osiągnięto po :");

        jtfroz.setEnabled(false);
        jtfroz.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jta.setEditable(false);
        jta.setColumns(20);
        jta.setLineWrap(true);
        jta.setRows(5);
        jta.setEnabled(false);
        jScrollPane1.setViewportView(jta);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Podaj liczbe randomizacji :");

        jtfiloscrand.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfiloscrandFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfiloscrandFocusLost(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(71, 172, 207));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Podawana formuła powinna wyglądać następująco: \npodformuła(1) && podformuła(2) && ... podformuła(n)\n        \nPrzykładowe formuły: \na && !b && c && !d\na && !b && c && !d && e && !f \n(a || b) && (c || !d)\na && !a\n(a && (!c || b)) && (!b || (e && d)) \n(a || b || c) && !a && !b && !c\na && (!a || b) && (!a || c)  \na && (!a || b) && (!a || c) && (!b || c) && d\na && (!a || b) && (!a || c) && (!b || c) && !d\n(cd.) && (d || (a && c)) && e && !f && (!e || g)   ");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(0, 0, 0), new java.awt.Color(51, 51, 51)));
        jTextArea1.setMinimumSize(new java.awt.Dimension(4, 2));
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfpodFormuly)
                                    .addComponent(jtfzmienne, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtfformula)
                                    .addComponent(jtfiloscrand, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfroz))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(47, 47, 47)
                                .addComponent(jScrollPane1)))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jbSprawdz, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfformula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfiloscrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfzmienne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtfpodFormuly, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtfroz, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbSprawdz, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSprawdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSprawdzActionPerformed
    doRoboty();
    }//GEN-LAST:event_jbSprawdzActionPerformed

    private void jbSprawdzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSprawdzMouseEntered
       jbSprawdz.setBackground(new Color(90,90,230));
    }//GEN-LAST:event_jbSprawdzMouseEntered

    private void jbSprawdzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSprawdzMouseExited
        jbSprawdz.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jbSprawdzMouseExited

    private void jtfformulaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfformulaFocusGained
       jtfformula.setBackground(cfocus);
       jtfformula.setForeground(Color.white);
    }//GEN-LAST:event_jtfformulaFocusGained

    private void jtfformulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfformulaFocusLost
       jtfformula.setBackground(clost);
       jtfformula.setForeground(Color.black);
    }//GEN-LAST:event_jtfformulaFocusLost

    private void jtfiloscrandFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfiloscrandFocusGained
        jtfiloscrand.setBackground(cfocus);
        jtfiloscrand.setForeground(Color.white);
    }//GEN-LAST:event_jtfiloscrandFocusGained

    private void jtfiloscrandFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfiloscrandFocusLost
        jtfiloscrand.setBackground(clost);
        jtfiloscrand.setForeground(Color.black);
    }//GEN-LAST:event_jtfiloscrandFocusLost

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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });

    }
    
    private void doRoboty() {
        
       /*Podawana formuła powinna wyglądać następująco: 
       podformuła(1) && podformuła(2) && ... podformuła(n)
        
       Przykładowe formuły: 
       a && !b && c && !d
       a && !b && c && !d && e && !f 
       (a || b) && (c || !d)
       a && !a
       (a && (!c || b)) && (!b || (e && d)) 
       (a || b || c) && !a && !b && !c
       a && (!a || b) && (!a || c)  
       a && (!a || b) && (!a || c) && (!b || c) && d
       a && (!a || b) && (!a || c) && (!b || c) && !d && (d || (a && c)) && e && !f && (!e || g)  
       */     

    try{
        String exp=jtfformula.getText();
        if(exp.equals("")){
            jtfformula.setText("Podaj formułę !");
        }
        
        ArrayList listaZM = new ArrayList();  //tworzymy listę w której umieścimy zmienne z formuły
        
            for (int i = 0; i < exp.length(); i++){  //dodawanie zmiennych do listy
                char c = exp.charAt(i);   
                if ((listaZM.contains(c) == false) && c != ' ' && c != '(' && c != ')' && c != '!' && c != '&' && c != '|'){
                    listaZM.add(c);
                }
            }
        
        jtfzmienne.setText(Arrays.toString(listaZM.toArray()));
        
        sprawdzenieRand();
        rozbicieNaPodformuly(exp, listaZM);

    }
       catch(Exception e){
           jtfformula.setText("Podaj formule np. (p&&q)||r");
       }
       
    }
    
    private void sprawdzenieRand(){
        try{
            HowManyRestarts=Integer.parseInt(jtfiloscrand.getText());
        }catch(Exception e){
            jtfiloscrand.setText("Podaj liczbę !");
        }
    }
    
    private void rozbicieNaPodformuly(String exp, ArrayList listaZM){
        
        ArrayList listaPod = new ArrayList();   
        int nawiasCounter = 0;
        String tmpS = "";
        
        for (int i = 0; i < exp.length(); i++){  
            
            char c = exp.charAt(i); 
            
            if ((c == '&' && nawiasCounter == 0) || i==(exp.length()-1)){   //spawdza czy doszliśmy do końca danej formuły
                if (i==(exp.length()-1)) tmpS +=c;
                listaPod.add(tmpS);
                tmpS = "";
                i+=1;  //przeskakujemy dodatkowe '&' i spację
                continue;
            }
            
            tmpS += c;
            
            if (c == '(') nawiasCounter++;
            
            if (c == ')') nawiasCounter--;
               
        }
        
        jtfpodFormuly.setText(Arrays.toString(listaPod.toArray()));
        
        algorytm(listaPod,listaZM, exp);
    }
    
    private void algorytm(ArrayList listaPod,ArrayList listaZM, String exp){
        
        JexlEngine jexl = new JexlEngine();                 // inicjalizacja Jexl
        
        jexl.setSilent(true);                               //przy takim ustawieniu nulle są przestawione na false
        jexl.setLenient(true);
        
        ArrayList listaExp = new ArrayList();

        for (Object s: listaPod ){
            String temp = "" + s;
            Expression expression = jexl.createExpression(temp);    //przekształca string w wyrażenie logiczne
            listaExp.add(expression);
        }
        
        
        JexlContext jexlContext = new MapContext();         //tworzy kontekst dla formuły
        
        //Algorytm GSAT
        


        if (showAlgorithm){                          //wersja z wypisywaniem działania
        
        Random rand = new Random();
        boolean [] r = {true, false};
        
        for (Object l : listaZM) {                          //dajemy losowe wartości dla wszystkich zmiennych
            String temp = "" + l;
            boolean rndB = r[rand.nextInt(2)];
            jexlContext.set(temp, rndB);                    
        }
        
        wypiszZmienne(listaZM, jexlContext);
        
        int SAT;                                        //SAT - ile podformuł jest spełnionych
        int tSAT = 0;                                       //tSAT - tu przechowujemy informacje o tym czy po zmianie zmiennej zwiększył się SAT
        int RestartFlag = 0;                                //kontrolujemy ile randomizacji wykonaliśmy
        
        do {
            
            SAT = 0;
            
            for (Object e: listaExp){                               //jeżeli podfunkcja jest TRUE to zwiększamy SAT
            Expression E = (Expression)e;
            if (((Boolean)E.evaluate(jexlContext)) == true) SAT++;  
            }
            
            System.out.println ("SAT = " + SAT);
            
            if (SAT == listaExp.size() ) break;
            
            for (int j=0; j<listaZM.size(); j++){                                           //iterujemy po zmiennych 
               String temp = "" + listaZM.get(j);                                           //jak zmienna jest true to zmieniamy na false i na odwrót
               System.out.println ("Zmieniamy zmienną " + temp);

               if ((Boolean)jexlContext.get(temp) == true)  jexlContext.set(temp, false);
               else jexlContext.set(temp, true);
               
               wypiszZmienne(listaZM, jexlContext);
               
               for (Object e: listaExp){
                    Expression E = (Expression)e;
                    if (((Boolean)E.evaluate(jexlContext)) == true) tSAT++;  
               }
               
               System.out.println ("tSAT = " + tSAT);
               
               if (tSAT > SAT){                                      //jeżeli znaleźliśmy przypadek, że tSAT > SAT to wracamy do j=0 ze zmienioną zmienną
                   System.out.println ("Znaleźliśmy tSAT większy od SAT");
                   SAT = tSAT;
                   tSAT = 0;
                   break;
               } else {                                               //w przeciwnym wypadku odmieniamy zmienną i idziemy do kolejnej
                   if ((Boolean)jexlContext.get(temp) == true)  jexlContext.set(temp, false);
                   else jexlContext.set(temp, true);
                   tSAT = 0;      
                   System.out.println ("Odmieniamy zmienną " + temp);
                   System.out.println();
                   wypiszZmienne(listaZM, jexlContext);
               }
               
               if (j==listaZM.size()-1){                               //jeżeli spróbowaliśmy zmienić wszyskie zmienne
                   if (RestartFlag == HowManyRestarts){                //w przypadku gdy wykonaliśmy wystarczająco wiele randomizacji    
                   System.out.println ("Nie znaleziono spełnienia po wykonaniu " + (HowManyRestarts+1) + " randomizacji");                  
                   System.exit(0);
                   }
                   else {
                       
                       RestartFlag++;                                   //jak nie to znowu randomizujemy i zwiększamy flagę
                       for (Object l : listaZM) {
                       String tempx = "" + l;
                       boolean rndB = r[rand.nextInt(2)];
                       jexlContext.set(tempx, rndB);           
                       }
                       
                       
                       System.out.println();
                       System.out.println();
                       System.out.println ("Restart nr" + RestartFlag);
                       System.out.println();
                       
                       wypiszZmienne(listaZM, jexlContext);
                       
                       break;
                       
                   }
               }
               
            }
            
            
        } while (SAT != listaExp.size());
        
        System.out.print("\nFormuła " + exp + " spełniona dla ");
        System.out.print("wartości: [");
                    for (Object l : listaZM) {
                        String tempx = "" + l;
                        boolean test = (Boolean)jexlContext.get(tempx);
                        System.out.print(tempx + ": " + test + " "); 
                     }
                System.out.println("]");
                System.out.println();
        if (RestartFlag > 0) System.out.println("Rozwiązanie osiągnięte po " + (RestartFlag+1) + " randomizacjach");  
        else System.out.println("Rozwiązanie osiągnięte po " + (RestartFlag+1) + " randomizacji");
        
    } 
        
        
    else {                              //wersja bez wypisywania, wersja na aplikacje okienkowa
        
            
        Random rand = new Random();
        boolean [] r = {true, false};
        
        for (Object l : listaZM) {                          //dajemy losowe wartości dla wszystkich zmiennych
            String temp = "" + l;
            boolean rndB = r[rand.nextInt(2)];
            jexlContext.set(temp, rndB);                    
        }
        
        int SAT;                                        //SAT - ile podformuł jest spełnionych
        int tSAT = 0;                                       //tSAT - tu przechowujemy informacje o tym czy po zmianie zmiennej zwiększył się SAT
        int RestartFlag = 0;                                //kontrolujemy ile randomizacji wykonaliśmy
        
        outerloop:
        do {
            
            SAT = 0;
            
            for (Object e: listaExp){                               //jeżeli podfunkcja jest TRUE to zwiększamy SAT
            Expression E = (Expression)e;
            if (((Boolean)E.evaluate(jexlContext)) == true) SAT++;  
            }
            
            if (SAT == listaExp.size() ) break;
            
            for (int j=0; j<listaZM.size(); j++){                                           //iterujemy po zmiennych 
               String temp = "" + listaZM.get(j);                                           //jak zmienna jest true to zmieniamy na false i na odwrót
               if ((Boolean)jexlContext.get(temp) == true)  jexlContext.set(temp, false);
               else jexlContext.set(temp, true);       
               
               for (Object e: listaExp){
                    Expression E = (Expression)e;
                    if (((Boolean)E.evaluate(jexlContext)) == true) tSAT++;  
               }              
               
               if (tSAT > SAT){                                      //jeżeli znaleźliśmy przypadek, że tSAT > SAT to wracamy do j=0 ze zmienioną zmienną
                   SAT = tSAT;
                   tSAT = 0;
                   break;
               } else {                                               //w przeciwnym wypadku odmieniamy zmienną i idziemy do kolejnej
                   if ((Boolean)jexlContext.get(temp) == true)  jexlContext.set(temp, false);
                   else jexlContext.set(temp, true);
                   tSAT = 0;         
               }
               
               if (j==listaZM.size()-1){                               //jeżeli spróbowaliśmy zmienić wszyskie zmienne
                   if (RestartFlag == HowManyRestarts){                //w przypadku gdy wykonaliśmy wystarczająco wiele randomizacji                       
                      // System.out.println ("Nie znaleziono spełnienia po wykonaniu " + (HowManyRestarts+1) + " randomizacji"); 
                      // System.exit(1);
                       break outerloop;
                       
                        
                   }
                   else {
                       
                       RestartFlag++;                                   //jak nie to znowu randomizujemy i zwiększamy flagę
                       for (Object l : listaZM) {
                       String tempx = "" + l;
                       boolean rndB = r[rand.nextInt(2)];
                       jexlContext.set(tempx, rndB);           
                       }
                       
                       break;
                       
                   }
               }
               
            }
            
            
        } while (SAT != listaExp.size());
        
        if (RestartFlag == HowManyRestarts){
        jta.setText("Nie znaleziono spełnienia po wykonaniu " + (HowManyRestarts) + " randomizacji");
        } else {
        String tempx="";
        String tempxx="";
                    for (Object l : listaZM) {
                        tempx = "" + l;
                        boolean test = (Boolean)jexlContext.get(tempx);
                        tempxx+=tempx + ": " + test + " "; 
                     }
  
        jta.setText(tempxx);
        String ran = "";
        int RF = (RestartFlag+1);
        if (RestartFlag > 0) {
          ran="randomizacjach";
            }
        else
            ran="randomizacji";
        jtfroz.setText(RF + " " + ran);
        }
        }
    }
    
    private void wypiszZmienne(ArrayList listaZM, JexlContext jexlContext){
        System.out.print("Wartości: [");
        for (Object l : listaZM) {
            String temp = "" + l;
            boolean test = (Boolean)jexlContext.get(temp);
            System.out.print(temp + ": " + test + " "); 
        }
        System.out.println("]");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbSprawdz;
    private javax.swing.JTextArea jta;
    private javax.swing.JTextField jtfformula;
    private javax.swing.JTextField jtfiloscrand;
    private javax.swing.JTextField jtfpodFormuly;
    private javax.swing.JTextField jtfroz;
    private javax.swing.JTextField jtfzmienne;
    // End of variables declaration//GEN-END:variables
}
