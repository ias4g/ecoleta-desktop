package edu.ecoleta.v2.components;

import br.com.ecoleta.alert.Alert;
import br.com.ecoleta.scrollCustom.ScrollBarCustomUI;
import br.com.ecoleta.types.AlertType;
import edu.ecoleta.v2.services.Utils;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class About extends javax.swing.JDialog {

    private final JFrame frm;
    private Animator animator;
    private Glass glass;
    private boolean show;
    private MessageType messageType = MessageType.CANCEL;

    public About(JFrame frm) {
        super(frm, true);
        this.frm = frm;
        initComponents();
        init();

        jspMain.getVerticalScrollBar().setUI(new ScrollBarCustomUI());
        jspLicence.getVerticalScrollBar().setUI(new ScrollBarCustomUI());
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeMessage();
            }

        });

        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                glass.setAlpha(f - f * 0.2f);
                setOpacity(f);
            }

            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                }
            }

        });

        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        setOpacity(0f);
        glass = new Glass();
    }

    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }

        this.show = show;
        animator.start();
    }

    public void showMessage() {
        frm.setGlassPane(glass);
        glass.setVisible(true);
//        jtaMessage.setText(message);
        setLocationRelativeTo(frm);
        startAnimator(true);
        setVisible(true);
    }

    public void closeMessage() {
        startAnimator(false);
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new edu.ecoleta.v2.components.AboutBackground();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jspMain = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextArea3 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblDeise = new javax.swing.JLabel();
        lblGabriel = new javax.swing.JLabel();
        lblHeberson = new javax.swing.JLabel();
        lblIzael = new javax.swing.JLabel();
        lblVitor = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        lblMySQL = new javax.swing.JLabel();
        lblAtxy2k = new javax.swing.JLabel();
        lblDom4j = new javax.swing.JLabel();
        lblGson = new javax.swing.JLabel();
        lblHttpClient = new javax.swing.JLabel();
        lblEclipse = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblViaCep = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jspLicence = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        btnClose = new edu.ecoleta.v2.components.JButtonDefault();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 401));
        setUndecorated(true);
        getContentPane().setLayout(null);

        background1.setMaximumSize(new java.awt.Dimension(600, 401));
        background1.setMinimumSize(new java.awt.Dimension(600, 401));
        background1.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/logo-icon-blue.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(16, 21, 74, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/GNU.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(552, 16, 32, 32);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Termos Condições e Licença");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 600, 64);

        jSeparator1.setBackground(new java.awt.Color(207, 207, 207));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(0, 62, 600, 2);

        background1.add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 64);

        jspMain.setBackground(new java.awt.Color(255, 255, 255));
        jspMain.setBorder(null);
        jspMain.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jspMain.setMaximumSize(new java.awt.Dimension(600, 273));
        jspMain.setMinimumSize(new java.awt.Dimension(600, 273));
        jspMain.setPreferredSize(new java.awt.Dimension(600, 273));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(600, 2020));
        jPanel3.setMinimumSize(new java.awt.Dimension(600, 2020));
        jPanel3.setPreferredSize(new java.awt.Dimension(600, 2020));
        jPanel3.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(568, 210));
        jPanel6.setMinimumSize(new java.awt.Dimension(568, 210));
        jPanel6.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel11.setText("SOBRE");
        jPanel6.add(jLabel11);
        jLabel11.setBounds(0, 0, 568, 30);

        jTextArea3.setEditable(false);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea3.setLineWrap(true);
        jTextArea3.setTabSize(0);
        jTextArea3.setText("ECOLETA DESKTOP é uma aplicação desenvolvida durante o segundo semestre do curso de CIÊNCIA DA COMPUTAÇÃO na UNIVERSIDADE NOVE DE JULHO (UNINOVE), como trabalho de conclusão de semestre. A ideia deste projeto é divulgar ponto de coletas de resíduos, como batérias, óleo entre outros. Limitado somenta à gestão e manutenção do ponto, como cadastrar, deletar, alterar. Como o objetivo do trabalho é o CRUD - CREATE, READ, UPDATE E DELETE no banco de dados, limitamos a isso, mas nada impede que nós desenvolvemos posteriormente uma aplicação web para listar e procurar pontos pertos de você.");
        jTextArea3.setWrapStyleWord(true);
        jTextArea3.setBorder(null);
        jTextArea3.setCaretPosition(0);
        jPanel6.add(jTextArea3);
        jTextArea3.setBounds(0, 48, 568, 180);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(16, 16, 568, 230);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel12.setText("DESENVOLVEDORES");
        jPanel7.add(jLabel12);
        jLabel12.setBounds(0, 0, 568, 30);

        lblDeise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/deyzy.png"))); // NOI18N
        lblDeise.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeise.setName("https://github.com/deyzy"); // NOI18N
        lblDeise.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeiseMouseClicked(evt);
            }
        });
        jPanel7.add(lblDeise);
        lblDeise.setBounds(0, 48, 568, 96);

        lblGabriel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/ratasba.png"))); // NOI18N
        lblGabriel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGabriel.setName("https://github.com/ratasba"); // NOI18N
        lblGabriel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGabrielMouseClicked(evt);
            }
        });
        jPanel7.add(lblGabriel);
        lblGabriel.setBounds(0, 148, 568, 96);

        lblHeberson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/bielhgsr.png"))); // NOI18N
        lblHeberson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHeberson.setName("https://github.com/bielhgsr"); // NOI18N
        lblHeberson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHebersonMouseClicked(evt);
            }
        });
        jPanel7.add(lblHeberson);
        lblHeberson.setBounds(0, 248, 568, 96);

        lblIzael.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/ias4g.png"))); // NOI18N
        lblIzael.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblIzael.setName("https://github.com/ias4g"); // NOI18N
        lblIzael.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblIzaelMouseClicked(evt);
            }
        });
        jPanel7.add(lblIzael);
        lblIzael.setBounds(0, 348, 568, 96);

        lblVitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/vitorguim2.png"))); // NOI18N
        lblVitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVitor.setName("https://github.com/vitorguim2"); // NOI18N
        lblVitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVitorMouseClicked(evt);
            }
        });
        jPanel7.add(lblVitor);
        lblVitor.setBounds(0, 448, 568, 96);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(16, 258, 568, 550);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(null);

        jLabel18.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel18.setText("BIBLIOTECAS UTILIZADAS");
        jPanel8.add(jLabel18);
        jLabel18.setBounds(0, 0, 568, 30);

        lblMySQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/mysql.png"))); // NOI18N
        lblMySQL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMySQL.setName("https://www.mysql.com/products/connector/"); // NOI18N
        lblMySQL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMySQLMouseClicked(evt);
            }
        });
        jPanel8.add(lblMySQL);
        lblMySQL.setBounds(0, 48, 568, 96);

        lblAtxy2k.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/atxy2k.png"))); // NOI18N
        lblAtxy2k.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtxy2k.setName("http://atxy2k.github.io/RestrictedTextField/"); // NOI18N
        lblAtxy2k.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtxy2kMouseClicked(evt);
            }
        });
        jPanel8.add(lblAtxy2k);
        lblAtxy2k.setBounds(0, 148, 568, 96);

        lblDom4j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/dom4j.png"))); // NOI18N
        lblDom4j.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDom4j.setName("https://dom4j.github.io/"); // NOI18N
        lblDom4j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDom4jMouseClicked(evt);
            }
        });
        jPanel8.add(lblDom4j);
        lblDom4j.setBounds(0, 248, 568, 96);

        lblGson.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/gson.png"))); // NOI18N
        lblGson.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGson.setName("https://github.com/google/gson"); // NOI18N
        lblGson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGsonMouseClicked(evt);
            }
        });
        jPanel8.add(lblGson);
        lblGson.setBounds(0, 348, 568, 96);

        lblHttpClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/httpclient.png"))); // NOI18N
        lblHttpClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHttpClient.setName("https://hc.apache.org/httpcomponents-client-4.5.x/"); // NOI18N
        lblHttpClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHttpClientMouseClicked(evt);
            }
        });
        jPanel8.add(lblHttpClient);
        lblHttpClient.setBounds(0, 448, 568, 96);

        lblEclipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/eclipse.png"))); // NOI18N
        lblEclipse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEclipse.setName("https://adoptopenjdk.net/"); // NOI18N
        lblEclipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEclipseMouseClicked(evt);
            }
        });
        jPanel8.add(lblEclipse);
        lblEclipse.setBounds(0, 548, 568, 96);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(16, 858, 568, 650);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel26.setText("WEBSERVICES");
        jPanel9.add(jLabel26);
        jLabel26.setBounds(0, 0, 568, 30);

        lblViaCep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/viacep.png"))); // NOI18N
        lblViaCep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblViaCep.setName("https://viacep.com.br/"); // NOI18N
        lblViaCep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViaCepMouseClicked(evt);
            }
        });
        jPanel9.add(lblViaCep);
        lblViaCep.setBounds(0, 48, 568, 97);

        jPanel3.add(jPanel9);
        jPanel9.setBounds(16, 1550, 568, 150);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel25.setText("GNU LICENÇA");
        jPanel4.add(jLabel25);
        jLabel25.setBounds(0, 0, 568, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/ecoleta/v2/images/GNU.png"))); // NOI18N
        jPanel4.add(jLabel4);
        jLabel4.setBounds(536, 0, 32, 32);

        jspLicence.setBorder(null);

        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setTabSize(0);
        jTextArea1.setText("LICENÇA PÚBLICA GERAL GNU - Versão 3, 29 de junho de 2007\n\n Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>\n Todos estão autorizados a copiar e distribuir cópias literais\n deste documento de licença, mas não é permitido alterá-lo.\n\n                            Preâmbulo\n\n  A GNU General Public License é uma licença copyleft gratuita para\nsoftware e outros tipos de trabalhos.\n\n  As licenças para a maioria dos softwares e outros trabalhos práticos são\npara tirar sua liberdade de compartilhar e mudar as obras. Por contraste,\na GNU General Public License destina-se a garantir sua liberdade de\ncompartilhar e alterar todas as versões de um programa - para garantir que ele permaneça livre\nsoftware para todos os seus usuários. Nós, a Free Software Foundation, usamos o\nLicença Pública Geral GNU para a maioria de nossos softwares; aplica-se também a\nqualquer outro trabalho lançado desta forma por seus autores. Você pode aplicá-lo para\nseus programas também.\n\n  Quando falamos de software livre, estamos nos referindo à liberdade, não\npreço. Nossas Licenças Públicas Gerais são projetadas para garantir que você\ntêm a liberdade de distribuir cópias de software livre (e cobrar por\nse desejar), que você recebe o código-fonte ou pode obtê-lo se\nquiser, que você pode alterar o software ou usar partes dele em novos\nprogramas gratuitos, e que você sabe que pode fazer essas coisas.\n\n  Para proteger seus direitos, precisamos impedir que outros neguem a você\nesses direitos ou pedindo que você abra mão dos direitos. Portanto, você tem\ncertas responsabilidades se você distribuir cópias do software ou se\nvocê o modifica: responsabilidades de respeitar a liberdade dos outros.\n\n  Por exemplo, se você distribuir cópias de tal programa, seja\ngratuitamente ou mediante pagamento de uma taxa, você deve repassar aos destinatários o mesmo\nliberdades que você recebeu. Você deve certificar-se de que eles também recebam\nou pode obter o código-fonte. E você deve mostrar a eles esses termos para que eles\nconhecer seus direitos.\n\n  Os desenvolvedores que usam a GNU GPL protegem seus direitos com duas etapas:\n(1) reivindicar direitos autorais sobre o software e (2) oferecer a você esta Licença\ndando a você permissão legal para copiá-lo, distribuí-lo e/ou modificá-lo.\n\n  Para a proteção dos desenvolvedores e autores, a GPL explica claramente\nque não há garantia para este software livre. Tanto para usuários quanto para\npelos autores, a GPL exige que as versões modificadas sejam marcadas como\nalterados, para que seus problemas não sejam atribuídos erroneamente a\nautores de versões anteriores.\n\n  Alguns dispositivos são projetados para negar aos usuários o acesso para instalar ou executar\nversões modificadas do software dentro deles, embora o fabricante\npode fazê-lo. Isso é fundamentalmente incompatível com o objetivo de\nprotegendo a liberdade dos usuários de alterar o software. A sistemática\npadrão de tal abuso ocorre na área de produtos para indivíduos\nutilização, que é precisamente onde é mais inaceitável. Portanto, nós\nprojetaram esta versão da GPL para proibir a prática para aqueles\nprodutos. Se tais problemas surgirem substancialmente em outros domínios, nós\nestamos prontos para estender esta provisão a esses domínios em versões futuras\nda GPL, conforme necessário para proteger a liberdade dos usuários.\n\n  Finalmente, todo programa é constantemente ameaçado por patentes de software.\nOs Estados não devem permitir que as patentes restrinjam o desenvolvimento e uso de\nsoftware em computadores de uso geral, mas naqueles que o fazem, desejamos\nevitar o perigo especial de que as patentes aplicadas a um programa livre possam\ntorná-lo efetivamente proprietário. Para evitar isso, a GPL garante que\npatentes não podem ser usadas para tornar o programa não-livre.\n\n  Os termos e condições precisos para cópia, distribuição e\nmodificação segue.\n\n                       TERMOS E CONDIÇÕES\n\n  0. Definições.\n\n  \"Esta Licença\" refere-se à versão 3 da GNU General Public License.\n\n  \"Direitos autorais\" também significa leis semelhantes a direitos autorais que se aplicam a outros tipos de\nobras, como máscaras semicondutoras.\n\n  \"O Programa\" refere-se a qualquer trabalho protegido por direitos autorais licenciado sob este\nLicença. Cada licenciado é endereçado como \"você\". \"Licenciados\" e\n\"destinatários\" podem ser indivíduos ou organizações.\n\n  \"Modificar\" uma obra significa copiar ou adaptar toda ou parte da obra\nde uma forma que exija permissão de direitos autorais, além da criação de um\ncópia exata. O trabalho resultante é chamado de \"versão modificada\" do\ntrabalho anterior ou um trabalho \"baseado\" no trabalho anterior.\n\n  Um \"trabalho coberto\" significa o Programa não modificado ou um trabalho baseado\nno Programa.\n\n  \"Propagar\" uma obra significa fazer com ela qualquer coisa que, sem\npermissão, o tornaria direta ou secundariamente responsável por\nviolação de acordo com a lei de direitos autorais aplicável, exceto executá-la em um\ncomputador ou modificar uma cópia privada. A propagação inclui a cópia,\ndistribuição (com ou sem modificação), disponibilizando ao\npúblico e, em alguns países, outras atividades também.\n\n  \"Transmitir\" uma obra significa qualquer tipo de propagação que possibilite outras\npartes para fazer ou receber cópias. Mera interação com um usuário através de\numa rede de computadores, sem transferência de uma cópia, não está transmitindo.\n\n  Uma interface de usuário interativa exibe \"Avisos Legais Apropriados\"\nna medida em que inclui um conveniente e bem visível\nrecurso que (1) exibe um aviso de direitos autorais apropriado e (2)\ninforma ao usuário que não há garantia para o trabalho (exceto para o\nmedida em que as garantias são fornecidas), que os licenciados podem transmitir a\ntrabalhar sob esta Licença e como visualizar uma cópia desta Licença. Se\na interface apresenta uma lista de comandos ou opções do usuário, como um\nmenu, um item proeminente na lista atende a esse critério.\n\n  1. Código Fonte.\n\n  O \"código-fonte\" de uma obra significa a forma preferida da obra\npara fazer modificações nele. \"Código objeto\" significa qualquer código não-fonte\nforma de uma obra.\n\n  Uma \"Interface Padrão\" significa uma interface que é uma interface oficial\nnorma definida por um organismo de normalização reconhecido, ou, no caso de\ninterfaces especificadas para uma determinada linguagem de programação, que\né amplamente utilizado entre os desenvolvedores que trabalham nessa linguagem.\n\n  As \"Bibliotecas do Sistema\" de um trabalho executável incluem qualquer coisa,\ndo que a obra como um todo, que (a) está incluído na forma normal de\nempacotar um Componente Principal, mas que não faz parte desse Componente Principal\nComponente, e (b) serve apenas para permitir o uso do trabalho com esse\nComponente Principal, ou para implementar uma Interface Padrão para a qual um\nimplementação está disponível ao público em forma de código-fonte. UMA\n\"Componente Principal\", neste contexto, significa um componente essencial principal\n(kernel, sistema de janelas e assim por diante) do sistema operacional específico\n(se houver) no qual o trabalho executável é executado, ou um compilador usado para\nproduzir o trabalho, ou um interpretador de código de objeto usado para executá-lo.\n\n  A \"Fonte Correspondente\" para um trabalho em forma de código objeto significa todos os\no código-fonte necessário para gerar, instalar e (para um executável\nwork) executar o código objeto e modificar o trabalho, incluindo scripts para\ncontrolar essas atividades. No entanto, não inclui o trabalho\nBibliotecas do sistema, ou ferramentas de uso geral ou geralmente disponíveis gratuitamente\nprogramas que são usados ​​sem modificações na execução dessas atividades, mas\nque não fazem parte do trabalho. Por exemplo, Fonte correspondente\ninclui arquivos de definição de interface associados a arquivos de origem para\no trabalho e o código-fonte para bibliotecas compartilhadas e dinamicamente\nsubprogramas vinculados que o trabalho é projetado especificamente para exigir,\ncomo por comunicação íntima de dados ou fluxo de controle entre esses\nsubprogramas e outras partes do trabalho.\n\n  A Fonte Correspondente não precisa incluir nada que os usuários\npode regenerar automaticamente a partir de outras partes do correspondente\nFonte.\n\n  A Fonte Correspondente para uma obra em forma de código fonte é aquela\nmesmo trabalho.\n\n  2. Permissões básicas.\n\n  Todos os direitos concedidos sob esta Licença são concedidos pelo prazo de\ndireitos autorais sobre o Programa, e são irrevogáveis, desde que\ncondições são atendidas. Esta Licença afirma explicitamente seu ilimitado\npermissão para executar o Programa não modificado. A saída da execução de um\ntrabalho coberto é coberto por esta Licença somente se a saída, dada sua\nconteúdo, constitui uma obra coberta. Esta Licença reconhece a sua\ndireitos de uso justo ou outro equivalente, conforme previsto pela lei de direitos autorais.\n\n  Você pode fazer, executar e propagar trabalhos cobertos que você não\ntransmitir, sem condições, desde que sua licença permaneça\nÀ força. Você pode transmitir obras cobertas a outras pessoas com o único propósito\nde tê-los fazer modificações exclusivamente para você, ou fornecer-lhe\ncom facilidades para a execução dessas obras, desde que cumpra\nos termos desta Licença ao transmitir todo o material para o qual você\nnão controla os direitos autorais. Aqueles que assim fazem ou executam as obras cobertas\npois você deve fazê-lo exclusivamente em seu nome, sob sua direção\ne controle, em termos que os proíbem de fazer quaisquer cópias de\nseu material protegido por direitos autorais fora de seu relacionamento com você.\n\n  O transporte sob quaisquer outras circunstâncias é permitido somente sob\nas condições indicadas abaixo. O sublicenciamento não é permitido; seção 10\ntorna desnecessário.\n\n  3. Protegendo os direitos legais dos usuários da lei antievasão.\n\n  Nenhum trabalho coberto deve ser considerado parte de um efetivo\nmedida de acordo com qualquer lei aplicável, cumprindo as obrigações nos termos do artigo\n11 do tratado de direitos autorais da OMPI adotado em 20 de dezembro de 1996, ou\nleis semelhantes que proíbem ou restringem a evasão de tais\nmedidas.\n\n  Ao transmitir uma obra coberta, você renuncia a qualquer poder legal de proibir\nevasão de medidas tecnológicas na medida em que tal evasão\né efetuado pelo exercício de direitos sob esta Licença com relação a\no trabalho coberto, e você se isenta de qualquer intenção de limitar a operação ou\nmodificação da obra como meio de fazer cumprir, contra a\nusuários, seus direitos legais ou de terceiros para proibir a evasão de\nmedidas tecnológicas.\n\n  4. Envio de cópias literais.\n\n  Você pode transmitir cópias literais do código-fonte do Programa conforme\nrecebê-lo, em qualquer meio, desde que você de forma conspícua e\npublicar adequadamente em cada cópia um aviso de direitos autorais apropriado;\nmanter intactos todos os avisos informando que esta Licença e qualquer\ntermos não permissivos adicionados de acordo com a seção 7 aplicam-se ao código;\nmanter intactos todos os avisos de ausência de qualquer garantia; e dar tudo\ndestinatários uma cópia desta Licença junto com o Programa.\n\n  Você pode cobrar qualquer preço ou nenhum preço por cada cópia que você transmitir,\ne você pode oferecer suporte ou proteção de garantia mediante o pagamento de uma taxa.\n\n  5. Transmitindo Versões de Origem Modificadas.\n\n  Você pode transmitir um trabalho baseado no Programa, ou as modificações\nproduzi-lo a partir do Programa, na forma de código-fonte sob a\ntermos da seção 4, desde que você também atenda a todas estas condições:\n\n    a) O trabalho deve conter avisos proeminentes informando que você modificou\n    e dando uma data relevante.\n\n    b) O trabalho deve conter avisos proeminentes informando que é\n    lançado sob esta Licença e quaisquer condições adicionadas na seção\n    7. Este requisito modifica o requisito da seção 4 para\n    \"manter intactos todos os avisos\".\n\n    c) Você deve licenciar a obra inteira, como um todo, sob este\n    Licença para qualquer pessoa que venha a possuir uma cópia. este\n    A licença será, portanto, aplicada, juntamente com qualquer seção 7 aplicável\n    termos adicionais, ao todo da obra, e todas as suas partes,\n    independentemente da forma como são embalados. Esta Licença não dá\n    permissão para licenciar o trabalho de qualquer outra forma, mas não\n    invalidar tal permissão se você a recebeu separadamente.\n\n    d) Se a obra tiver interfaces interativas com o usuário, cada uma deve exibir\n    Avisos Legais Apropriados; no entanto, se o Programa tiver interativo\n    interfaces que não exibem Avisos Legais Apropriados, seu\n    trabalho não precisa obrigá-los a fazê-lo.\n\n  Uma compilação de uma obra coberta com outras obras separadas e independentes\nobras, que não são, por sua natureza, extensões da obra coberta,\ne que não são combinados com ele de modo a formar um programa maior,\ndentro ou em um volume de um meio de armazenamento ou distribuição, é chamado de\n\"agregado\" se a compilação e seus direitos autorais resultantes não forem\nusado para limitar o acesso ou direitos legais dos usuários da compilação\nalém do que as obras individuais permitem. Inclusão de uma obra coberta\nem um agregado não faz com que esta Licença se aplique a outros\npartes do agregado.\n\n  6. Envio de Formulários Não Originais.\n\n  Você pode transmitir uma obra coberta na forma de código de objeto sob os termos\ndas seções 4 e 5, desde que você também transmita a\nFonte Correspondente legível por máquina sob os termos desta Licença,\nde uma dessas maneiras:\n\n    a) Transmitir o código do objeto ou incorporado em um produto físico\n    (incluindo um meio de distribuição físico), acompanhado do\n    Fonte correspondente fixada em um meio físico durável\n    normalmente usado para intercâmbio de software.\n\n    b) Transmitir o código do objeto ou incorporado em um produto físico\n    (incluindo um meio de distribuição físico), acompanhado por um\n    oferta por escrito, válida por pelo menos três anos e válida por\n    desde que você ofereça peças de reposição ou suporte ao cliente para esse produto\n    model, para dar a qualquer um que possua o código objeto (1) um\n    cópia da Fonte Correspondente para todo o software no\n    produto que é coberto por esta Licença, em um suporte físico durável\n    meio habitualmente usado para intercâmbio de software, por um preço não\n    mais do que seu custo razoável de realizar fisicamente este\n    transmissão da fonte, ou (2) acesso para copiar o\n    Fonte correspondente de um servidor de rede sem custo.\n\n    c) Transmitir cópias individuais do código objeto com uma cópia do\n    oferta por escrito para fornecer a Fonte Correspondente. este\n    alternativa é permitida apenas ocasionalmente e não comercialmente, e\n    somente se você recebeu o código do objeto com tal oferta, de acordo\n    com a subseção 6b.\n\n    d) Transmitir o código objeto oferecendo acesso a partir de um\n    local (gratuito ou pago) e oferecem acesso equivalente ao\n    Fonte correspondente da mesma maneira através do mesmo lugar em nenhum\n    carga adicional. Você não precisa exigir que os destinatários copiem o\n    Origem correspondente junto com o código do objeto. Se o lugar para\n    copiar o código do objeto é um servidor de rede, a Fonte Correspondente\n    pode estar em um servidor diferente (operado por você ou por terceiros)\n    que suporta recursos de cópia equivalentes, desde que você mantenha\n    instruções claras ao lado do código do objeto dizendo onde encontrar o\n    Fonte correspondente. Independentemente de qual servidor hospeda o\n    Fonte Correspondente, você permanece obrigado a garantir que seja\n    disponível pelo tempo que for necessário para satisfazer esses requisitos.\n\n    e) Transmitir o código objeto usando transmissão ponto a ponto, desde que\n    você informa a outros peers onde o código do objeto e o correspondente\n    As fontes do trabalho estão sendo oferecidas ao público em geral sem\n    cobrança de acordo com a subseção 6d.\n\n  Uma parte separável do código-objeto, cujo código-fonte é excluído\nda Fonte Correspondente como uma Biblioteca do Sistema, não precisam ser\nincluído na transmissão do trabalho de código de objeto.\n\n  Um \"Produto de usuário\" é (1) um \"produto de consumo\", o que significa qualquer\npropriedade pessoal tangível que normalmente é usada para fins pessoais, familiares,\nou uso doméstico, ou (2) qualquer coisa projetada ou vendida para incorporação\nem uma moradia. Ao determinar se um produto é um produto de consumo,\nos casos duvidosos serão resolvidos a favor da cobertura. Para um determinado\nproduto recebido por um determinado usuário, \"normalmente usado\" refere-se a um\nuso típico ou comum dessa classe de produto, independentemente do status\ndo usuário em particular ou da maneira pela qual o usuário em particular\nrealmente usa, espera ou espera usar o produto. Um produto\né um produto de consumo, independentemente de o produto ter\nusos comerciais, industriais ou não de consumo, a menos que tais usos representem\no único modo significativo de uso do produto.\n\n  \"Informações de Instalação\" para um Produto do Usuário significa quaisquer métodos,\nprocedimentos, chaves de autorização ou outras informações necessárias para instalar\ne executar versões modificadas de um trabalho coberto nesse Produto do Usuário a partir de\numa versão modificada de sua Fonte Correspondente. A informação deve\nsuficiente para garantir que o funcionamento contínuo do objeto modificado\ncódigo não é, em nenhum caso, impedido ou interferido apenas porque\nmodificação foi feita.\n\n  Se você transmitir um trabalho de código de objeto sob esta seção em, ou com, ou\nespecificamente para uso em um Produto do Usuário, e o transporte ocorre conforme\nparte de uma transação em que o direito de posse e uso do\nO Produto do Usuário é transferido para o destinatário em perpetuidade ou por um\nprazo fixo (independentemente de como a operação seja caracterizada), o\nA Fonte Correspondente transmitida nesta seção deve ser acompanhada\npelas Informações de Instalação. Mas este requisito não se aplica\nse nem você nem qualquer terceiro mantiver a capacidade de instalar\ncódigo de objeto modificado no Produto do Usuário (por exemplo, o trabalho foi\nfoi instalado na ROM).\n\n  O requisito de fornecer informações de instalação não inclui um\nrequisito para continuar a fornecer serviço de suporte, garantia ou atualizações\npor uma obra que tenha sido modificada ou instalada pelo destinatário, ou por\no Produto do Usuário no qual foi modificado ou instalado. Acesso a um\nrede pode ser negada quando a modificação em si materialmente e\nafeta negativamente a operação da rede ou viola as regras e\nprotocolos de comunicação na rede.\n\n  Fonte correspondente transmitida e informações de instalação fornecidas,\nde acordo com esta seção deve estar em um formato que é publicamente\ndocumentado (e com uma implementação disponível ao público em\ncódigo-fonte) e não deve exigir senha ou chave especial para\ndesembalar, ler ou copiar.\n\n  7. Termos Adicionais.\n\n  \"Permissões adicionais\" são termos que complementam os termos deste\nLicencie fazendo exceções de uma ou mais de suas condições.\nPermissões adicionais aplicáveis ​​a todo o Programa devem\nser tratados como se estivessem incluídos nesta Licença, na medida\nque eles são válidos sob a lei aplicável. Se permissões adicionais\nse aplicam apenas a parte do Programa, essa parte pode ser usada separadamente\nsob essas permissões, mas todo o Programa permanece regido por\nesta Licença sem considerar as permissões adicionais.\n\n  Ao transmitir uma cópia de uma obra coberta, você pode, a seu critério,\nremover quaisquer permissões adicionais dessa cópia ou de qualquer parte\nisto. (Permissões adicionais podem ser escritas para exigir seus próprios\nremoção em certos casos quando você modifica o trabalho.) Você pode colocar\npermissões adicionais sobre o material, adicionadas por você a um trabalho coberto,\npara os quais você tem ou pode dar permissão de direitos autorais apropriada.\n\n  Não obstante qualquer outra disposição desta Licença, para o material que você\nadicionar a um trabalho coberto, você pode (se autorizado pelos detentores dos direitos autorais de\nesse material) complementam os termos desta Licença com os termos:\n\n    a) Isenção de garantia ou limitação de responsabilidade de forma diferente da\n    termos das seções 15 e 16 desta Licença; ou\n\n    b) Exigir a preservação de avisos legais razoáveis ​​especificados ou\n    atribuições de autor nesse material ou no Legal Apropriado\n    Avisos exibidos por obras que o contenham; ou\n\n    c) Proibir a deturpação da origem desse material, ou\n    exigindo que as versões modificadas de tal material sejam marcadas em\n    formas razoáveis ​​como diferentes da versão original; ou\n\n    d) Limitar o uso para fins publicitários de nomes de licenciantes ou\n    autores do material; ou\n\n    e) Recusar-se a conceder direitos sob a lei de marcas registradas para uso de alguns\n    nomes comerciais, marcas registradas ou marcas de serviço; ou\n\n    f) Exigir indenização dos licenciantes e autores daquele\n    material por qualquer pessoa que transmita o material (ou versões modificadas de\n    it) com pressupostos contratuais de responsabilidade para com o destinatário, por\n    qualquer responsabilidade que essas premissas contratuais imponham diretamente sobre\n    esses licenciadores e autores.\n\n  Todos os outros termos adicionais não permissivos são considerados \"mais\nrestrições\" dentro do significado da seção 10. Se o Programa como você\nrecebido, ou qualquer parte dele, contém um aviso informando que é\nregida por esta Licença juntamente com um termo que é uma\nrestrição, você pode remover esse termo. Se um documento de licença contiver\numa restrição adicional, mas permite relicenciar ou transmitir sob este\nLicença, você pode adicionar a um material de trabalho coberto regido pelos termos\ndesse documento de licença, desde que a restrição adicional não\nnão sobreviver a tal relicenciamento ou transmissão.\n\n  Se você adicionar termos a um trabalho coberto de acordo com esta seção, você\ndeve colocar, nos arquivos de origem relevantes, uma declaração do\ntermos adicionais que se aplicam a esses arquivos, ou um aviso indicando\nonde encontrar os termos aplicáveis.\n\n  Termos adicionais, permissivos ou não permissivos, podem ser indicados no\nforma de uma licença escrita separadamente, ou declarada como exceções;\nos requisitos acima se aplicam de qualquer maneira.\n\n  8. Rescisão.\n\n  Você não pode propagar ou modificar um trabalho coberto, exceto conforme expressamente\nfornecidos sob esta Licença. Qualquer tentativa de outra forma de propagar ou\nmodificá-lo é nulo e encerrará automaticamente seus direitos sob\nesta Licença (incluindo quaisquer licenças de patentes concedidas sob o terceiro\nparágrafo da seção 11).\n\n  No entanto, se você cessar todas as violações desta Licença, seu\na licença de um detentor de direitos autorais em particular é restabelecida (a)\nprovisoriamente, a menos e até que o detentor dos direitos autorais explicitamente e\nfinalmente rescindir sua licença, e (b) permanentemente, se os direitos autorais\ntitular não notificar você sobre a violação por alguns meios razoáveis\nantes de 60 dias após a cessação.\n\n  Além disso, sua licença de um detentor de direitos autorais específico é\nrestabelecido permanentemente se o detentor dos direitos autorais o notificar da\nviolação por alguns meios razoáveis, esta é a primeira vez que você\nrecebeu notificação de violação desta Licença (para qualquer trabalho) daquele\ndetentor dos direitos autorais, e você corrige a violação antes de 30 dias após\nseu recebimento do aviso.\n\n  A rescisão de seus direitos sob esta seção não encerra a\nlicenças de terceiros que receberam cópias ou direitos de você sob\nesta Licença. Se seus direitos foram rescindidos e não permanentemente\nrestabelecido, você não se qualifica para receber novas licenças para o mesmo\nmaterial na seção 10.\n\n  9. Aceitação não necessária para ter cópias.\n\n  Você não é obrigado a aceitar esta Licença para receber ou\nexecutar uma cópia do Programa. Propagação auxiliar de uma obra coberta\nocorrendo apenas como consequência do uso de transmissão ponto a ponto\nreceber uma cópia também não requer aceitação. No entanto,\nnada além desta Licença concede a você permissão para propagar ou\nmodificar qualquer trabalho coberto. Essas ações infringem os direitos autorais se você\nnão aceita esta Licença. Portanto, ao modificar ou propagar um\ntrabalho coberto, você indica sua aceitação desta Licença para fazê-lo.\n\n  10. Licenciamento Automático de Destinatários a Jusante.\n\n  Cada vez que você transmite uma obra coberta, o destinatário automaticamente\nrecebe uma licença dos licenciadores originais, para executar, modificar e\npropagar esse trabalho, sujeito a esta Licença. Você não é responsável\npara impor a conformidade de terceiros com esta Licença.\n\n  Uma \"transação de entidade\" é uma transação que transfere o controle de um\norganização, ou substancialmente todos os ativos de uma, ou subdividindo uma\norganização, ou organizações de fusão. Se a propagação de uma cobertura\ntrabalho resulta de uma transação da entidade, cada parte\ntransação quem recebe uma cópia da obra também recebe o que quer que seja\nlicenças para o trabalho que o antecessor do partido tinha ou poderia\ndar nos termos do número anterior, acrescido do direito de posse do\nFonte correspondente do trabalho do antecessor em interesse, se\no antecessor o possui ou pode obtê-lo com esforços razoáveis.\n\n  Você não pode impor quaisquer outras restrições ao exercício do\ndireitos concedidos ou afirmados sob esta Licença. Por exemplo, você pode\nnão impor uma taxa de licença, royalties ou outro encargo para o exercício de\ndireitos concedidos sob esta Licença, e você não pode iniciar litígio\n(incluindo uma reclamação cruzada ou reconvenção em uma ação judicial) alegando que\nqualquer reivindicação de patente é infringida fazendo, usando, vendendo, oferecendo para\nvenda, ou importar o Programa ou qualquer parte dele.\n\n  11. Patentes.\n\n  Um \"colaborador\" é um detentor de direitos autorais que autoriza o uso sob este\nLicença do Programa ou um trabalho no qual o Programa é baseado. o\ntrabalho assim licenciado é chamado de \"versão do contribuidor\" do contribuidor.\n\n  As \"reivindicações de patentes essenciais\" de um colaborador são todas as reivindicações de patentes\nde propriedade ou controlada pelo contribuinte, já adquirido ou\nadquiridos, que seriam infringidos de alguma forma, permitidos\npor esta Licença, de fazer, usar ou vender sua versão de contribuidor,\nmas não inclua reivindicações que seriam infringidas apenas como\nconsequência de modificação adicional da versão do contribuidor. Por\nfins desta definição, \"controle\" inclui o direito de conceder\nsublicenças de patentes de forma consistente com os requisitos de\nesta Licença.\n\n  Cada colaborador concede a você um prêmio não exclusivo, mundial e isento de royalties.\nlicença de patente sob as reivindicações de patentes essenciais do colaborador, para\nfazer, usar, vender, colocar à venda, importar e executar, modificar e\npropagar o conteúdo de sua versão de contribuidor.\n\n  Nos três parágrafos seguintes, uma \"licença de patente\" é qualquer\nacordo ou compromisso, qualquer que seja a denominação, de não fazer valer uma patente\n(como uma permissão expressa para praticar uma patente ou compromisso de não\nprocessar por violação de patente). Para \"conceder\" tal licença de patente a um\nparte significa fazer tal acordo ou compromisso de não fazer cumprir uma\npatente contra a parte.\n\n  Se você transmitir um trabalho coberto, confiando conscientemente em uma licença de patente,\ne a Fonte Correspondente da obra não está disponível para ninguém\ncopiar, gratuitamente e nos termos desta Licença, por meio de um\nservidor de rede publicamente disponível ou outro meio facilmente acessível,\nentão você deve (1) fazer com que a Fonte Correspondente seja tão\ndisponível, ou (2) providenciar para se privar do benefício do\nlicença de patente para este trabalho em particular, ou (3) providenciar, de forma\nconsistente com os requisitos desta Licença, para estender a patente\nlicença para destinatários a jusante. \"Confiar conscientemente\" significa que você\nconhecimento real de que, exceto pela licença de patente, você está transmitindo a\ntrabalho coberto em um país ou o uso do trabalho coberto por seu destinatário\nem um país, infringiria uma ou mais patentes identificáveis ​​nesse\npaís que você tem motivos para acreditar que são válidos.\n\n  Se, de acordo com ou em conexão com uma única transação ou\narranjo, você transmite ou propaga adquirindo o transporte de um\ntrabalho coberto e conceder uma licença de patente a algumas das partes\nreceber a obra coberta autorizando-os a usar, propagar, modificar\nou transmitir uma cópia específica da obra coberta, então a licença de patente\nque você concede é automaticamente estendido a todos os destinatários da cobertura\ntrabalho e trabalha com base nele.\n\n  Uma licença de patente é \"discriminatória\" se não incluir\nalcance de sua cobertura, proíbe o exercício de, ou é\ncondicionado ao não exercício de um ou mais dos direitos que lhe são\nespecificamente concedido sob esta Licença. Você não pode transmitir uma cobertura\ntrabalhar se você for parte de um acordo com um terceiro que é\nno negócio de distribuição de software, sob o qual você faz o pagamento\na terceiros com base na extensão de sua atividade de transmissão\na obra, e sob a qual o terceiro concede, a qualquer uma das\npartes que receberiam o trabalho coberto de você, uma discriminação\nlicença de patente (a) em conexão com cópias da obra coberta\ntransmitida por você (ou cópias feitas dessas cópias), ou (b) principalmente\npara e em conexão com produtos específicos ou compilações que\nconter o trabalho coberto, a menos que você tenha celebrado esse acordo,\nou que a licença de patente foi concedida, antes de 28 de março de 2007.\n\n  Nada nesta Licença deve ser interpretado como excluindo ou limitando\nqualquer licença implícita ou outras defesas contra infrações que possam\ncaso contrário, estará disponível para você de acordo com a lei de patentes aplicável.\n\n  12. Nenhuma rendição da liberdade dos outros.\n\n  Se lhe forem impostas condições (seja por ordem judicial, acordo ou\ncaso contrário) que contrariem as condições desta Licença, eles não\nisentá-lo das condições desta Licença. Se você não pode transmitir uma\ntrabalho coberto de modo a satisfazer simultaneamente suas obrigações sob este\nLicença e quaisquer outras obrigações pertinentes, então, como consequência, você pode\nnão transmiti-lo de forma alguma. Por exemplo, se você concordar com os termos que o obrigam\npara coletar um royalty para transmissão adicional daqueles a quem você transmite\no Programa, a única maneira de satisfazer tanto esses termos como este\nLicença seria abster-se inteiramente de transmitir o Programa.\n\n  13. Use com a Licença Pública Geral GNU Affero.\n\n  Não obstante qualquer outra disposição desta Licença, você tem\npermissão para vincular ou combinar qualquer trabalho coberto com um trabalho licenciado\nsob a versão 3 da GNU Affero General Public License em um único\ntrabalho combinado, e para transmitir o trabalho resultante. Os termos deste\nA licença continuará a ser aplicada à parte que é a obra coberta,\nmas os requisitos especiais da GNU Affero General Public License,\nA seção 13, relativa à interação por meio de uma rede, se aplicará ao\ncombinação como tal.\n\n  14. Versões Revisadas desta Licença.\n\n  A Free Software Foundation pode publicar versões revisadas e/ou novas de\na GNU General Public License de tempos em tempos. Essas novas versões irão\nser semelhante em espírito à versão atual, mas pode diferir em detalhes para\nresolver novos problemas ou preocupações.\n\n  Cada versão recebe um número de versão distinto. Se o\nO programa especifica que uma certa versão numerada do GNU General\nLicença Pública \"ou qualquer versão posterior\" se aplica a ela, você tem a\nopção de seguir os termos e condições de qualquer um dos numerados\nversão ou de qualquer versão posterior publicada pelo Software Livre\nFundação. Se o Programa não especificar um número de versão do\nGNU General Public License, você pode escolher qualquer versão já publicada\npela Free Software Foundation.\n\n  Se o Programa especificar que um proxy pode decidir qual futuro\nversões da GNU General Public License podem ser usadas, o proxy desse\ndeclaração pública de aceitação de uma versão autoriza você permanentemente\npara escolher essa versão para o Programa.\n\n  Versões de licenças posteriores podem fornecer\npermissões. No entanto, não são impostas obrigações adicionais a qualquer\nautor ou detentor de direitos autorais como resultado de sua escolha em seguir um\nversão posterior.\n\n  15. Renúncia de Garantia.\n\n  NÃO HÁ GARANTIA PARA O PROGRAMA, NA MEDIDA PERMITIDA POR\nLEI APLICÁVEL. EXCETO QUANDO INDICADO DE OUTRA FORMA POR ESCRITO OS DIREITOS AUTORAIS\nTITULARES E/OU OUTRAS PARTES FORNECEM O PROGRAMA \"COMO ESTÁ\" SEM GARANTIA\nDE QUALQUER TIPO, EXPRESSA OU IMPLÍCITA, INCLUINDO, MAS NÃO SE LIMITANDO A,\nAS GARANTIAS IMPLÍCITAS DE COMERCIALIZAÇÃO E ADEQUAÇÃO A UM PARTICULAR\nPROPÓSITO. TODO O RISCO QUANTO À QUALIDADE E DESEMPENHO DO PROGRAMA\nÉ COM VOCÊ. CASO O PROGRAMA ESTEJA DEFEITUOSO, VOCÊ ASSUME O CUSTO DE\nTODA A MANUTENÇÃO, REPARO OU CORREÇÃO NECESSÁRIA.\n\n  16. Limitação de Responsabilidade.\n\n  EM NENHUMA HIPÓTESE, A MENOS QUE EXIGIDO PELA LEI APLICÁVEL OU ACORDADO POR ESCRITO\nQUALQUER TITULAR DOS DIREITOS AUTORAIS OU QUALQUER OUTRA PARTE QUE MODIFICA E/OU TRANSMITA\nO PROGRAMA CONFORME PERMITIDO ACIMA, SERÁ RESPONSÁVEL PERANTE VOCÊ POR DANOS, INCLUINDO QUAISQUER\nDANOS GERAIS, ESPECIAIS, INCIDENTAIS OU CONSEQUENTES DECORRENTES DO\nUSO OU INCAPACIDADE DE USAR O PROGRAMA (INCLUINDO, MAS NÃO SE LIMITANDO À PERDA DE\nDADOS OU DADOS QUE ESTÃO SENDO PRECISOS OU PERDAS SUSTENTADAS POR VOCÊ OU POR TERCEIROS\nPARTES OU FALHA DO PROGRAMA PARA OPERAR COM QUAISQUER OUTROS PROGRAMAS),\nMESMO QUE TAL TITULAR OU OUTRA PARTE TENHA SIDO AVISADA DA POSSIBILIDADE DE\nTAIS DANOS.\n\n  17. Interpretação das Seções 15 e 16.\n\n  Se a isenção de garantia e limitação de responsabilidade fornecida\nacima não pode ter efeito legal local de acordo com seus termos,\ntribunais revisores devem aplicar a lei local que mais se aproxime\numa renúncia absoluta de qualquer responsabilidade civil em relação ao\nPrograma, a menos que uma garantia ou assunção de responsabilidade acompanhe um\ncópia do Programa em troca de uma taxa.\n\n                     FIM DOS TERMOS E CONDIÇÕES\n\n            Como aplicar estes termos aos seus novos programas\n\n  Se você desenvolve um novo programa e quer que ele seja da maior\npossível ao público, a melhor maneira de conseguir isso é torná-lo\nsoftware livre que todos podem redistribuir e alterar sob estes termos.\n\n  Para isso, anexe os seguintes avisos ao programa. É mais seguro\npara anexá-los ao início de cada arquivo de origem para\ndeclarar a exclusão da garantia; e cada arquivo deve ter pelo menos\na linha \"copyright\" e um ponteiro para onde se encontra o aviso completo.\n\n    <uma linha para dar o nome do programa e uma breve ideia do que ele faz.>\n    Direitos autorais (C) <ano> <nome do autor>\n\n    Este programa é um software livre: você pode redistribuí-lo e/ou modificá-lo\n    sob os termos da GNU General Public License conforme publicada por\n    a Free Software Foundation, seja a versão 3 da Licença, ou\n    (a seu critério) qualquer versão posterior.\n\n    Este programa é distribuído na esperança de que seja útil,\n    mas SEM QUALQUER GARANTIA; sem mesmo a garantia implícita de\n    COMERCIALIZAÇÃO ou ADEQUAÇÃO A UM DETERMINADO FIM. Veja o\n    Licença Pública Geral GNU para mais detalhes.\n\n    Você deve ter recebido uma cópia da Licença Pública Geral GNU\n    junto com este programa. Caso contrário, consulte <https://www.gnu.org/licenses/>.\n\nAdicione também informações sobre como entrar em contato com você por correio eletrônico e em papel.\n\n  Se o programa faz interação de terminal, faça com que ele produza um curto\nobserve assim quando ele iniciar em um modo interativo:\n\n    <programa> Copyright (C) <ano> <nome do autor>\n    Este programa vem com ABSOLUTAMENTE NENHUMA GARANTIA; para detalhes digite `show w'.\n    Este é um software livre, e você pode redistribuí-lo\n    sob certas condições; digite `show c' para detalhes.\n\nOs comandos hipotéticos `show w' e `show c' devem mostrar o\npartes da Licença Pública Geral. Claro, os comandos do seu programa\npode ser diferente; para uma interface GUI, você usaria uma \"caixa sobre\".\n\n  Você também deve obter seu empregador (se você trabalha como programador) ou escola,\nse houver, para assinar uma \"renúncia de direitos autorais\" para o programa, se necessário.\nPara obter mais informações sobre isso e como aplicar e seguir a GNU GPL, consulte\n<https://www.gnu.org/licenses/>.\n\n  A GNU General Public License não permite incorporar seu programa\nem programas proprietários. Se o seu programa é uma biblioteca de sub-rotinas, você\npode considerar mais útil permitir a vinculação de aplicativos proprietários com\na biblioteca. Se é isso que você quer fazer, use o GNU Lesser General\nLicença Pública em vez desta Licença. Mas antes leia\n<https://www.gnu.org/licenses/why-not-lgpl.html>.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(null);
        jTextArea1.setCaretPosition(0);
        jspLicence.setViewportView(jTextArea1);

        jPanel4.add(jspLicence);
        jspLicence.setBounds(0, 48, 568, 220);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(16, 1750, 568, 273);

        jspMain.setViewportView(jPanel3);

        background1.add(jspMain);
        jspMain.setBounds(0, 64, 600, 273);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(207, 207, 207));
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 0, 600, 2);

        btnClose.setBackground(new java.awt.Color(207, 207, 207));
        btnClose.setForeground(new java.awt.Color(80, 80, 80));
        btnClose.setText("Fechar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);
        btnClose.setBounds(264, 16, 72, 32);

        background1.add(jPanel2);
        jPanel2.setBounds(0, 337, 600, 64);

        getContentPane().add(background1);
        background1.setBounds(0, 0, 600, 401);

        setSize(new java.awt.Dimension(600, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        closeMessage();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void lblDeiseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeiseMouseClicked

        try {
            Utils.openUrl(lblDeise.getName(), lblDeise);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblDeiseMouseClicked

    private void lblGabrielMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGabrielMouseClicked

        try {
            Utils.openUrl(lblGabriel.getName(), lblGabriel);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblGabrielMouseClicked

    private void lblHebersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHebersonMouseClicked

        try {
            Utils.openUrl(lblHeberson.getName(), lblHeberson);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblHebersonMouseClicked

    private void lblIzaelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblIzaelMouseClicked

        try {
            Utils.openUrl(lblIzael.getName(), lblIzael);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblIzaelMouseClicked

    private void lblVitorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVitorMouseClicked

        try {
            Utils.openUrl(lblVitor.getName(), lblVitor);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblVitorMouseClicked

    private void lblMySQLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMySQLMouseClicked

        try {
            Utils.openUrl(lblMySQL.getName(), lblMySQL);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblMySQLMouseClicked

    private void lblAtxy2kMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtxy2kMouseClicked

        try {
            Utils.openUrl(lblAtxy2k.getName(), lblAtxy2k);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblAtxy2kMouseClicked

    private void lblDom4jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDom4jMouseClicked

        try {
            Utils.openUrl(lblDom4j.getName(), lblDom4j);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblDom4jMouseClicked

    private void lblGsonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGsonMouseClicked

        try {
            Utils.openUrl(lblGson.getName(), lblGson);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblGsonMouseClicked

    private void lblHttpClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHttpClientMouseClicked

        try {
            Utils.openUrl(lblHttpClient.getName(), lblHttpClient);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblHttpClientMouseClicked

    private void lblEclipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEclipseMouseClicked

        try {
            Utils.openUrl(lblEclipse.getName(), lblEclipse);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblEclipseMouseClicked

    private void lblViaCepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViaCepMouseClicked

        try {
            Utils.openUrl(lblViaCep.getName(), lblViaCep);
        } catch (URISyntaxException | IOException ex) {
            new Alert(this, true, ex.getMessage(), AlertType.ERROR).showAlert();
        }

    }//GEN-LAST:event_lblViaCepMouseClicked

    public static enum MessageType {
        CANCEL, OK
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.ecoleta.v2.components.AboutBackground background1;
    private edu.ecoleta.v2.components.JButtonDefault btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JScrollPane jspLicence;
    private javax.swing.JScrollPane jspMain;
    private javax.swing.JLabel lblAtxy2k;
    private javax.swing.JLabel lblDeise;
    private javax.swing.JLabel lblDom4j;
    private javax.swing.JLabel lblEclipse;
    private javax.swing.JLabel lblGabriel;
    private javax.swing.JLabel lblGson;
    private javax.swing.JLabel lblHeberson;
    private javax.swing.JLabel lblHttpClient;
    private javax.swing.JLabel lblIzael;
    private javax.swing.JLabel lblMySQL;
    private javax.swing.JLabel lblViaCep;
    private javax.swing.JLabel lblVitor;
    // End of variables declaration//GEN-END:variables

    private class Glass extends JComponent {

        private float alpha = 0f;

        public Glass() {

        }

        public float getAlpha() {
            return alpha;
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            g2.setColor(Color.GRAY);
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
            super.paintComponent(g);
        }

    }

}
