package projetointerdiciplinar;

import interfaceManipulacao.Manipulacao;
import javax.swing.JOptionPane;

public class Caderno extends Produto implements Manipulacao {

    private int qtdDeFolhas;
    private String tamanho;
    private String tipo;
    private boolean capadura;

    public Caderno() {
    }

    public Caderno(int qtdDeFolhas, String tamanho, String tipo, boolean capadura) {
        this.qtdDeFolhas = qtdDeFolhas;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.capadura = capadura;
    }

    public int getQtdDeFolhas() {
        return qtdDeFolhas;
    }

    public void setQtdDeFolhas(int qtdDeFolhas) {
        this.qtdDeFolhas = qtdDeFolhas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isCapadura() {
        return capadura;
    }

    public void setCapadura(boolean capadura) {
        this.capadura = capadura;
    }
    //Método para cadastrar Objeto Caderno
    @Override
    public boolean cadastro() {
        setQtdDeFolhas(Integer.parseInt(JOptionPane.showInputDialog("Cadastro Caderno:\nDigite a quantidade de folhas: ")));
        setTamanho(JOptionPane.showInputDialog("Digite o tamanho do caderno: "));
        setTipo(JOptionPane.showInputDialog("Digite o tipo do caderno: "));
        String capadura = JOptionPane.showInputDialog("Caderno capa dura? Digite Sim ou Não: ");
        
        if (capadura.equalsIgnoreCase("sim")) {
            setCapadura(true);
        } else {
            setCapadura(false);
        }
        setMarca(JOptionPane.showInputDialog("Digite a marca do caderno: "));
        setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do caderno: ")));
        return true;
    }
    //Método para Consultar Objeto Caderno
    @Override
    public String consulta() {
        String capa;
        if (this.capadura == true) {
            capa = "Sim";
        } else {
            capa = "Não";
        }
        return "\nTipo: " + this.tipo + "\nCapaDura: "
                + capa + "\nTamanho: " + this.tamanho
                + "\nQuantidade De Folhas: " + this.qtdDeFolhas
                + "\nMarca: " + getMarca() + "\nValor: " + getValor();

    }

    @Override
    public String toString() {
        return "Caderno{" + "qtdDeFolhas=" + qtdDeFolhas
                + ", tamanho=" + tamanho + ", tipo=" + tipo + ", capadura=" + capadura + '}';
    }

}
