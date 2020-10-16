package projetointerdiciplinar;

import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class ProjetoInterdiciplinar {

    public static void main(String[] args) {
        ArrayList<Pedido> pedidos = new ArrayList<>();
        String as, ta, ja;
        int menu;
        int menu2;
        
        do {
            
            menu = Integer.parseInt(JOptionPane.showInputDialog("***Menu***\n1 Cadastrar Novo Pedido"
                + "\n2 Consultar\n3 Listar Todos Pedidos \n4 Sair"));

            switch (menu) {

                case 1://Cadastro do Pedido
                    ArrayList<CaixaLapis> cxLapis = new ArrayList<>();
                    ArrayList<Papel> papel = new ArrayList<>();
                    ArrayList<Caderno> caderno = new ArrayList<>();

                    JOptionPane.showMessageDialog(null,"=== Cadastrar Pedido ===");

                    Data data = new Data();
                    
                    data.setDia(Integer.parseInt(JOptionPane.showInputDialog("***Data***\nDigite o Dia:")));
                    data.setMes(Integer.parseInt(JOptionPane.showInputDialog("***Data***\nDigite o Mês:")));
                    data.setAno(Integer.parseInt(JOptionPane.showInputDialog("***Data***\nDigite o Ano:")));

                    Cliente cliente = new Cliente();
                    
                    
                    cliente.setNome(JOptionPane.showInputDialog("Cliente\nDigite o Nome:"));
                    cliente.setCpf(JOptionPane.showInputDialog("Cliente\nDigite o CPF"));
                    cliente.setTelefone(JOptionPane.showInputDialog("Cliente\nDigite o Telefone"));


                    do {
                        menu2 = Integer.parseInt(JOptionPane.showInputDialog("***Escolha o produto que deseja cadastrar*** \n1 Caixa Lápis"
                + "\n2 Papel\n3 Caderno\n4 Finalizar Pedido"));

                        switch (menu2) {
                            case 1:
                                do {
                                    CaixaLapis cx = new CaixaLapis();
                                    cx.cadastro();
                                    cxLapis.add(cx);
                                    as = JOptionPane.showInputDialog("Deseja cadastar mais caixa de lápis? Digite sim ou não: ");
                                } while (as.equalsIgnoreCase("Sim"));
                                break;

                            case 2:
                                do {
                                    Papel pa = new Papel();
                                    pa.cadastro();
                                    papel.add(pa);
                                    ta = JOptionPane.showInputDialog("Deseja cadastar mais papel? Digite sim ou não: ");
                                } while (ta.equalsIgnoreCase("Sim"));
                                break;

                            case 3:
                                do {
                                    Caderno ca = new Caderno();
                                    ca.cadastro();
                                    caderno.add(ca);
                                    ja = JOptionPane.showInputDialog("Deseja cadastar mais caderno? Digite sim ou não: ");
                                } while (ja.equalsIgnoreCase("Sim"));
                                break;

                            case 4:
                                JOptionPane.showMessageDialog(null, "Finalizando Pedido...\n");
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opção Inválida");
                        }

                    } while (menu2 != 4);
                    //Adicionar pedido cadastrado na lista
                    Pedido a = new Pedido();
                    a.setData(data);
                    a.setCliente(cliente);
                    a.setCxLapis(cxLapis);
                    a.setCarderno(caderno);
                    a.setPapel(papel);
                    a.calculaTotalPedido();
                    pedidos.add(a);
                    break;

                case 2://Consulta do Pedido
                    if (pedidos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "\nPedido não encontrado!!!");
                    } else {
                        String saidaa = "";
                        for (Pedido l : pedidos) {
                            saidaa = l.consulta();
                        }
                        JOptionPane.showMessageDialog(null, "\n=== Consultar Pedido ===\n" + saidaa);
                    }
                    break;

                case 3://Lista de Todos os Pedidos
                    if (pedidos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "\nPedido não encontrado!!!");
                    }else{
                    String saida = "";
                    int i = 1;
                    for (Pedido p : pedidos) {
                        saida += "\n=== Pedido Nº " + (i++) + " ===\n";
                        saida += p.consulta();
                    }
                    JOptionPane.showMessageDialog(null, "\n=== Lista de Todos Pedidos ===\n" + saida);
                    }
                    break;

                case 4://Encerrar Programa
                    JOptionPane.showMessageDialog(null,     "Saindo...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        } while (menu != 4);
    }

}
