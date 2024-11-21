package proyectoso2;

public class Proyecto2GUI extends javax.swing.JFrame {
    static BattleArena arena;
    static Administrator admin;
    static IA cpu;
    int currentPID = 0;

    public Proyecto2GUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.init();
    }

    private void init() {
        arena = new BattleArena(this);
        cpu = new IA(arena, 1);
        admin = new Administrator(arena, cpu);
        updateP1QueueS1();
        updateP2QueueS1();
        updateP3QueueS1();
        updateP1QueueS2();
        updateP2QueueS2();
        updateP3QueueS2();
    }

    int getPID() {
        int PID = currentPID;
        currentPID++;
        return PID;
    }

    void updateP1QueueS1() {
        Studio studio1 = arena.studio1;
        Queue<Character> p1 = studio1.p1;
        String text = "";

        Node<Character> node = p1.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p1Area.setText(text);
    }

    void updateP2QueueS1() {
        Studio studio1 = arena.studio1;
        Queue<Character> p2 = studio1.p2;
        String text = "";

        Node<Character> node = p2.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p2Area.setText(text);
    }

    void updateP3QueueS1() {
        Studio studio1 = arena.studio1;
        Queue<Character> p3 = studio1.p3;
        String text = "";

        Node<Character> node = p3.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p3Area.setText(text);
    }

    void updateP1QueueS2() {
        Studio studio = arena.studio2;
        Queue<Character> p1 = studio.p1;
        String text = "";

        Node<Character> node = p1.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p1Area2.setText(text);
    }

    void updateP2QueueS2() {
        Studio studio = arena.studio2;
        Queue<Character> p2 = studio.p2;
        String text = "";

        Node<Character> node = p2.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p2Area2.setText(text);
    }

    void updateP3QueueS2() {
        Studio studio = arena.studio2;
        Queue<Character> p3 = studio.p3;
        String text = "";

        Node<Character> node = p3.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        p3Area2.setText(text);
    }

    void updateRefQueueS1() {
        Studio studio = arena.studio1;
        Queue<Character> ref = studio.reinforcement;
        String text = "";

        Node<Character> node = ref.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        refArea1.setText(text);
    }

    void updateRefQueueS2() {
        Studio studio = arena.studio2;
        Queue<Character> ref = studio.reinforcement;
        String text = "";

        Node<Character> node = ref.front;
        while (node != null) {
            text += node.data.name + " (PID: " + node.data.PID + ")" + ", ";
            node = node.next;
        }

        refArea2.setText(text);
    }

    void updateArenaS1() {
        Character c = arena.fighter1;
        nintendoArena.setText(c.name + ":\n  --HP: " + c.hitPoints + "\n  --Strength: " + c.strength + "\n  --Agiity: "
                + c.agility + "\n  --Abilities: " + c.abilities);
    }

    void updateArenaS2() {
        Character c = arena.fighter2;
        capcomArena.setText(c.name + ":\n  --HP: " + c.hitPoints + "\n  --Strength: " + c.strength + "\n  --Agiity: "
                + c.agility + "\n  --Abilities: " + c.abilities);
    }

    void updateIAStatus(String status) {
        statusText.setText("Estado Actual: " + status);
    }

    void updateGamesWonS1() {
        nintendoGamesWon.setText("Juegos Ganados por Star Wars: " + arena.studio1.winners);
    }

    void updateGamesWonS2() {
        capcomGamesWon.setText("Juegos Ganados por Star Trek: " + arena.studio2.winners);
    }

    void updateResult(String result) {
        resultText.setText("Resultado: \n" + result);
    }

    void updateS1Winners(String winner) {
        String before = s1Winners.getText();
        s1Winners.setText(before + winner + "\n");
    }

    void updateS2Winners(String winner) {
        String before = s2Winners.getText();
        s2Winners.setText(before + winner + "\n");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        ganadores = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        s1Winners = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        s2Winners = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        arenaPanel = new javax.swing.JPanel();
        vsText = new javax.swing.JLabel();
        capcomGamesWon = new javax.swing.JLabel();
        nintendoGamesWon = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        nintendoArena = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        capcomArena = new javax.swing.JTextArea();
        resultText = new javax.swing.JLabel();
        capcomText = new javax.swing.JLabel();
        arenaText = new javax.swing.JLabel();
        drive3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        prioridad1C = new javax.swing.JLabel();
        prioridad2C = new javax.swing.JLabel();
        prioridad3C = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p1Area = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        p2Area = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        p3Area = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        refArea1 = new javax.swing.JTextArea();
        prioridad3C2 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        IAPanel = new javax.swing.JPanel();
        statusText = new javax.swing.JLabel();
        plusVelocity = new javax.swing.JButton();
        velocityText = new javax.swing.JLabel();
        minusText = new javax.swing.JButton();
        start = new javax.swing.JButton();
        start1 = new javax.swing.JButton();
        drive4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        prioridad1C1 = new javax.swing.JLabel();
        prioridad2C1 = new javax.swing.JLabel();
        prioridad3C1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        p1Area2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        p2Area2 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        p3Area2 = new javax.swing.JTextArea();
        prioridad3C3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        refArea2 = new javax.swing.JTextArea();

        s1Winners.setColumns(20);
        s1Winners.setRows(5);
        s1Winners.setFocusable(false);
        jScrollPane12.setViewportView(s1Winners);

        s2Winners.setColumns(20);
        s2Winners.setRows(5);
        s2Winners.setFocusable(false);
        jScrollPane14.setViewportView(s2Winners);

        jLabel1.setText("Ganadores de Star Wars:");

        jLabel2.setText("Ganadores de Star Trek:");

        javax.swing.GroupLayout ganadoresLayout = new javax.swing.GroupLayout(ganadores.getContentPane());
        ganadores.getContentPane().setLayout(ganadoresLayout);
        ganadoresLayout.setHorizontalGroup(
            ganadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ganadoresLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(ganadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(ganadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                        .addComponent(jScrollPane14)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        ganadoresLayout.setVerticalGroup(
            ganadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ganadoresLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane13.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        arenaPanel.setBackground(new java.awt.Color(0, 0, 0));
        arenaPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        vsText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        vsText.setText("VS");

        capcomGamesWon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        capcomGamesWon.setForeground(new java.awt.Color(255, 255, 255));
        capcomGamesWon.setText("Juegos Ganados por  Star Trek: 0");

        nintendoGamesWon.setBackground(new java.awt.Color(0, 0, 0));
        nintendoGamesWon.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        nintendoGamesWon.setForeground(new java.awt.Color(255, 255, 255));
        nintendoGamesWon.setText("Juegos Ganados por Star Wars: 0 ");

        nintendoArena.setColumns(20);
        nintendoArena.setLineWrap(true);
        nintendoArena.setRows(5);
        jScrollPane10.setViewportView(nintendoArena);

        capcomArena.setColumns(20);
        capcomArena.setLineWrap(true);
        capcomArena.setRows(5);
        jScrollPane11.setViewportView(capcomArena);

        resultText.setText("Resultado: Procesando ");

        javax.swing.GroupLayout arenaPanelLayout = new javax.swing.GroupLayout(arenaPanel);
        arenaPanel.setLayout(arenaPanelLayout);
        arenaPanelLayout.setHorizontalGroup(
            arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arenaPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(vsText))
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nintendoGamesWon)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(capcomGamesWon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(arenaPanelLayout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(resultText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        arenaPanelLayout.setVerticalGroup(
            arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arenaPanelLayout.createSequentialGroup()
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(arenaPanelLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(vsText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(arenaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(capcomGamesWon)
                    .addComponent(nintendoGamesWon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resultText)
                .addGap(14, 14, 14))
        );

        capcomText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        capcomText.setText(" Star Trek");

        arenaText.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        arenaText.setText("Arena");

        drive3.setBackground(new java.awt.Color(0, 0, 0));
        drive3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Colas");

        prioridad1C.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad1C.setForeground(new java.awt.Color(255, 255, 255));
        prioridad1C.setText("--- Prioridad 1: ");

        prioridad2C.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad2C.setForeground(new java.awt.Color(255, 255, 255));
        prioridad2C.setText("--- Prioridad 2: ");

        prioridad3C.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad3C.setForeground(new java.awt.Color(255, 255, 255));
        prioridad3C.setText("--- Prioridad 3: ");

        p1Area.setEditable(false);
        p1Area.setColumns(20);
        p1Area.setLineWrap(true);
        p1Area.setRows(5);
        jScrollPane1.setViewportView(p1Area);

        p2Area.setEditable(false);
        p2Area.setColumns(20);
        p2Area.setLineWrap(true);
        p2Area.setRows(5);
        jScrollPane2.setViewportView(p2Area);

        p3Area.setEditable(false);
        p3Area.setColumns(20);
        p3Area.setLineWrap(true);
        p3Area.setRows(5);
        jScrollPane4.setViewportView(p3Area);

        refArea1.setEditable(false);
        refArea1.setColumns(20);
        refArea1.setLineWrap(true);
        refArea1.setRows(5);
        jScrollPane8.setViewportView(refArea1);

        prioridad3C2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad3C2.setForeground(new java.awt.Color(255, 255, 255));
        prioridad3C2.setText("--- Refuerzo: ");

        javax.swing.GroupLayout drive3Layout = new javax.swing.GroupLayout(drive3);
        drive3.setLayout(drive3Layout);
        drive3Layout.setHorizontalGroup(
            drive3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drive3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(127, 127, 127))
            .addGroup(drive3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(drive3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridad3C)
                    .addComponent(prioridad2C)
                    .addComponent(prioridad1C)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridad3C2))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        drive3Layout.setVerticalGroup(
            drive3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drive3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(11, 11, 11)
                .addComponent(prioridad1C)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad2C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad3C)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad3C2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel50.setBackground(new java.awt.Color(0, 0, 0));
        jLabel50.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel50.setText("Star Wars");

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel51.setText("Inteligencia Artificial");

        IAPanel.setBackground(new java.awt.Color(0, 0, 0));
        IAPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        statusText.setForeground(new java.awt.Color(255, 255, 255));
        statusText.setText("Estatus: ");

        plusVelocity.setBackground(new java.awt.Color(153, 255, 153));
        plusVelocity.setText("+");
        plusVelocity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusVelocityActionPerformed(evt);
            }
        });

        velocityText.setForeground(new java.awt.Color(255, 255, 255));
        velocityText.setText("Velocidad Actual: 1");

        minusText.setBackground(new java.awt.Color(153, 255, 153));
        minusText.setText("-");
        minusText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusTextActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(153, 255, 153));
        start.setText("Comenzar Simulación");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        start1.setBackground(new java.awt.Color(153, 255, 153));
        start1.setText("Mostrar Ganadores");
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IAPanelLayout = new javax.swing.GroupLayout(IAPanel);
        IAPanel.setLayout(IAPanelLayout);
        IAPanelLayout.setHorizontalGroup(
            IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IAPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusText)
                    .addGroup(IAPanelLayout.createSequentialGroup()
                        .addComponent(velocityText)
                        .addGap(29, 29, 29)
                        .addComponent(minusText)
                        .addGap(18, 18, 18)
                        .addComponent(plusVelocity)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(start1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        IAPanelLayout.setVerticalGroup(
            IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IAPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusText)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IAPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(velocityText)
                    .addComponent(minusText)
                    .addComponent(plusVelocity)
                    .addComponent(start1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        drive4.setBackground(new java.awt.Color(0, 0, 0));
        drive4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Colas");

        prioridad1C1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad1C1.setForeground(new java.awt.Color(255, 255, 255));
        prioridad1C1.setText("--- Prioridad 1: ");

        prioridad2C1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad2C1.setForeground(new java.awt.Color(255, 255, 255));
        prioridad2C1.setText("--- Prioridad 2: ");

        prioridad3C1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad3C1.setForeground(new java.awt.Color(255, 255, 255));
        prioridad3C1.setText("--- Prioridad 3: ");

        p1Area2.setEditable(false);
        p1Area2.setColumns(20);
        p1Area2.setLineWrap(true);
        p1Area2.setRows(5);
        jScrollPane5.setViewportView(p1Area2);

        p2Area2.setEditable(false);
        p2Area2.setColumns(20);
        p2Area2.setLineWrap(true);
        p2Area2.setRows(5);
        jScrollPane6.setViewportView(p2Area2);

        p3Area2.setEditable(false);
        p3Area2.setColumns(20);
        p3Area2.setLineWrap(true);
        p3Area2.setRows(5);
        jScrollPane7.setViewportView(p3Area2);

        prioridad3C3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        prioridad3C3.setForeground(new java.awt.Color(255, 255, 255));
        prioridad3C3.setText("--- Refuerzo: ");

        refArea2.setEditable(false);
        refArea2.setColumns(20);
        refArea2.setLineWrap(true);
        refArea2.setRows(5);
        jScrollPane9.setViewportView(refArea2);

        javax.swing.GroupLayout drive4Layout = new javax.swing.GroupLayout(drive4);
        drive4.setLayout(drive4Layout);
        drive4Layout.setHorizontalGroup(
            drive4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, drive4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(127, 127, 127))
            .addGroup(drive4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(drive4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridad3C1)
                    .addComponent(prioridad2C1)
                    .addComponent(prioridad1C1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridad3C3)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        drive4Layout.setVerticalGroup(
            drive4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(drive4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addComponent(prioridad1C1)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad2C1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad3C1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioridad3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(drive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel50)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drive4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(capcomText)))
                .addGap(0, 92, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(arenaText))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IAPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(arenaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel51)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(capcomText)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(drive3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drive4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(arenaText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arenaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minusTextActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_minusTextActionPerformed
        if (cpu.velocity > 1) {
            int newVelocity = cpu.velocity - 1;
            cpu.setVelocity(newVelocity);
            velocityText.setText("Velocidad Actual: " + newVelocity);
        }
    }// GEN-LAST:event_minusTextActionPerformed

    private void plusVelocityActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_plusVelocityActionPerformed
        int newVelocity = cpu.velocity + 1;
        cpu.setVelocity(newVelocity);
        velocityText.setText("Velocidad Actual: " + newVelocity);
    }// GEN-LAST:event_plusVelocityActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        admin.start();
        cpu.start();
    }// GEN-LAST:event_startActionPerformed

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_start1ActionPerformed
        // TODO add your handling code here:
        ganadores.pack();
        ganadores.setVisible(true);
    }// GEN-LAST:event_start1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proyecto2GUI.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto2GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IAPanel;
    private javax.swing.JPanel arenaPanel;
    private javax.swing.JLabel arenaText;
    private javax.swing.JTextArea capcomArena;
    private javax.swing.JLabel capcomGamesWon;
    private javax.swing.JLabel capcomText;
    private javax.swing.JPanel drive3;
    private javax.swing.JPanel drive4;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JDialog ganadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton minusText;
    private javax.swing.JTextArea nintendoArena;
    private javax.swing.JLabel nintendoGamesWon;
    private javax.swing.JTextArea p1Area;
    private javax.swing.JTextArea p1Area2;
    private javax.swing.JTextArea p2Area;
    private javax.swing.JTextArea p2Area2;
    private javax.swing.JTextArea p3Area;
    private javax.swing.JTextArea p3Area2;
    private javax.swing.JButton plusVelocity;
    private javax.swing.JLabel prioridad1C;
    private javax.swing.JLabel prioridad1C1;
    private javax.swing.JLabel prioridad2C;
    private javax.swing.JLabel prioridad2C1;
    private javax.swing.JLabel prioridad3C;
    private javax.swing.JLabel prioridad3C1;
    private javax.swing.JLabel prioridad3C2;
    private javax.swing.JLabel prioridad3C3;
    private javax.swing.JTextArea refArea1;
    private javax.swing.JTextArea refArea2;
    private javax.swing.JLabel resultText;
    private javax.swing.JTextArea s1Winners;
    private javax.swing.JTextArea s2Winners;
    private javax.swing.JButton start;
    private javax.swing.JButton start1;
    private javax.swing.JLabel statusText;
    private javax.swing.JLabel velocityText;
    private javax.swing.JLabel vsText;
    // End of variables declaration//GEN-END:variables
}
