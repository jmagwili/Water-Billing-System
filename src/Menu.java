
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
        mouseListener();
        pnlDashboard.setBackground(Color.decode("#0a4565"));
        pnlDashboard.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlDashboard = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        pnlClientDetails = new javax.swing.JPanel();
        lblClientDetails = new javax.swing.JLabel();
        pnlLogout = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        pnlBilling = new javax.swing.JPanel();
        lblBilling = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\dash.png"));
        jLabel2.setText("Dashboard");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setOpaque(false);

        pnlDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDashboard.setName("dashboard"); // NOI18N
        pnlDashboard.setOpaque(false);

        lblDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dash.png"))); // NOI18N
        lblDashboard.setText("Dashboard");

        javax.swing.GroupLayout pnlDashboardLayout = new javax.swing.GroupLayout(pnlDashboard);
        pnlDashboard.setLayout(pnlDashboardLayout);
        pnlDashboardLayout.setHorizontalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pnlDashboardLayout.setVerticalGroup(
            pnlDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDashboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlClientDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlClientDetails.setName("clientDetails"); // NOI18N
        pnlClientDetails.setOpaque(false);

        lblClientDetails.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblClientDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblClientDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client.png"))); // NOI18N
        lblClientDetails.setText("Client Details");

        javax.swing.GroupLayout pnlClientDetailsLayout = new javax.swing.GroupLayout(pnlClientDetails);
        pnlClientDetails.setLayout(pnlClientDetailsLayout);
        pnlClientDetailsLayout.setHorizontalGroup(
            pnlClientDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientDetailsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblClientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pnlClientDetailsLayout.setVerticalGroup(
            pnlClientDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClientDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblClientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLogout.setOpaque(false);

        lblLogout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        lblLogout.setText("Log out");

        javax.swing.GroupLayout pnlLogoutLayout = new javax.swing.GroupLayout(pnlLogout);
        pnlLogout.setLayout(pnlLogoutLayout);
        pnlLogoutLayout.setHorizontalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLogoutLayout.setVerticalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlBilling.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBilling.setName("billing"); // NOI18N
        pnlBilling.setOpaque(false);

        lblBilling.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBilling.setForeground(new java.awt.Color(255, 255, 255));
        lblBilling.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.png"))); // NOI18N
        lblBilling.setText("Billing");

        javax.swing.GroupLayout pnlBillingLayout = new javax.swing.GroupLayout(pnlBilling);
        pnlBilling.setLayout(pnlBillingLayout);
        pnlBillingLayout.setHorizontalGroup(
            pnlBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBillingLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBillingLayout.setVerticalGroup(
            pnlBillingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBillingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBilling, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-rounded.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlBilling, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlClientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addComponent(pnlDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlClientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlBilling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gp = new GradientPaint(0,0,Color.decode("#1CB5E0"),0,getHeight(),Color.decode("#000046"));
        g2d.setPaint(gp);
        g2d.fillRect(0,0,getWidth(),getHeight());
        super.paintChildren(g);
    }
    
    private void mouseEvent(JPanel p){
 
        p.addMouseListener(new MouseAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                pnlDashboard.setBackground(new Color(0,0,0));
                pnlDashboard.setOpaque(false);
                pnlClientDetails.setBackground(new Color(0,0,0));
                pnlClientDetails.setOpaque(false);
                pnlBilling.setBackground(new Color(0,0,0));
                pnlBilling.setOpaque(false);
                p.setBackground(Color.decode("#0a4565"));
                p.setOpaque(true);
            }
            /*
            @Override
            public void mouseEntered(MouseEvent e) {
                p.setBackground(Color.decode("#0a4565"));
                p.setOpaque(true);               
            }

            @Override
            public void mouseExited(MouseEvent e) {
                p.setBackground(new Color(0,0,0));
                p.setOpaque(false);

            }
            */
            
              
        });
    }
    
    private void mouseListener(){
        mouseEvent(pnlDashboard);
        mouseEvent(pnlClientDetails);
        mouseEvent(pnlBilling);
        
    }
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBilling;
    private javax.swing.JLabel lblClientDetails;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblLogout;
    public javax.swing.JPanel pnlBilling;
    public javax.swing.JPanel pnlClientDetails;
    public javax.swing.JPanel pnlDashboard;
    public javax.swing.JPanel pnlLogout;
    // End of variables declaration//GEN-END:variables
}
