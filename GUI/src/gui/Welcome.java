package gui;

// @author JacobGT
public class Welcome extends javax.swing.JFrame {

    public Welcome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 255, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("Hola, y bienvenido a mi calculadora GUI en Java.\nAl usar cosas como sen, cos, tan, ! u otras funciones\nPrimero debes ingresar el número, despues hacer click en la operacion deseada\nY de ultimo en el boton de igual '='.\nGracias por usar mi calculadora.\n                        (\"           ,aodObo,\" +\n                       \"\\n        ,AMMMMP~~~~\" +\n                       \"\\n     ,MMMMMMMMA.\" +\n                       \"\\n  ,M;'     `YV'\\n\" +\n                       \"  AM' ,OMA,\\n\" +\n                       \" AM|   `~VMM,.      .,ama,____,amma,..\\n\" +\n                       \" MML      )MMMD   .AMMMMMMMMMMMMMMMMMMD.\\n\" +\n                       \" VMMM    .AMMY'  ,AMMMMMMMMMMMMMMMMMMMMD\\n\" +\n                       \" `VMM, AMMMV'  ,AMMMMMMMMMMMMMMMMMMMMMMM,                ,\\n\" +\n                       \"  VMMMmMMV'  ,AMY~~''  'MMMMMMMMMMMM' '~~             ,aMM\\n\" +\n                       \"  `YMMMM'   AMM'        `VMMMMMMMMP'_              A,aMMMM\\n\" +\n                       \"   AMMM'    VMMA. YVmmmMMMMMMMMMMML MmmmY          MMMMMMM\\n\" +\n                       \"  ,AMMA   _,HMMMMmdMMMMMMMMMMMMMMMML`VMV'         ,MMMMMMM\\n\" +\n                       \"  AMMMA _'MMMMMMMMMMMMMMMMMMMMMMMMMMA `'          MMMMMMMM\\n\" +\n                       \" ,AMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMa      ,,,   `MMMMMMM\\n\" +\n                       \" AMMMMMMMMM'~`YMMMMMMMMMMMMMMMMMMMMMMA    ,AMMV    MMMMMMM\\n\" +\n                       \" VMV MMMMMV   `YMMMMMMMMMMMMMMMMMMMMMY   `VMMY'  adMMMMMMM\\n\" +\n                       \" `V  MMMM'      `YMMMMMMMV.~~~~~~~~~,aado,`V''   MMMMMMMMM\\n\" +\n                       \"    aMMMMmv       `YMMMMMMMm,    ,/AMMMMMA,      YMMMMMMMM\\n\" +\n                       \"    VMMMMM,,v       YMMMMMMMMMo oMMMMMMMMM'    a, YMMMMMMM\\n\" +\n                       \"    `YMMMMMY'       `YMMMMMMMY' `YMMMMMMMY     MMmMMMMMMMM\\n\" +\n                       \"     AMMMMM  ,        ~~~~~,aooooa,~~~~~~      MMMMMMMMMMM\\n\" +\n                       \"       YMMMb,d'         dMMMMMMMMMMMMMD,   a,, AMMMMMMMMMM\\n\" +\n                       \"        YMMMMM, A       YMMMMMMMMMMMMMY   ,MMMMMMMMMMMMMMM\\n\" +\n                       \"       AMMMMMMMMM        `~~~~'  `~~~~'   AMMMMMMMMMMMMMMM\\n\" +\n                       \"       `VMMMMMM'  ,A,                  ,,AMMMMMMMMMMMMMMMM\\n\" +\n                       \"     ,AMMMMMMMMMMMMMMA,       ,aAMMMMMMMMMMMMMMMMMMMMMMMMM\\n\" +\n                       \"   ,AMMMMMMMMMMMMMMMMMMA,    AMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\n\" +\n                       \" ,AMMMMMMMMMMMMMMMMMMMMMA   AMMMMMMMMMMMMMMMMMMMMMMMMMMMMM\\n\" +\n                       \"AMMMMMMMMMMMMMMMMMMMMMMMMAaAMMMMMMMMM            -JacobGT\");\n");
        jScrollPane1.setViewportView(jTextArea1);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(exit)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
