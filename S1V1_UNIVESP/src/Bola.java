public class Bola {
    // Atributos privados (encapsulados)
    private String material;
    private String cor;
    private int tamanho;
    private boolean cheia;

    // Construtor padrão (sem parâmetros)
    public Bola() {
        this.material = "desconhecido";
        this.cor = "desconhecido";
        this.tamanho = 0;
        this.cheia = false;
    }

    // Construtor com todos os atributos (sobrecarga)
    public Bola(String material, String cor, int tamanho, boolean cheia) {
        this.material = material;
        this.cor = cor;
        this.tamanho = tamanho;
        this.cheia = cheia;
    }

    // Construtor com sobrecarga (apenas cor e tamanho)
    public Bola(String cor, int tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = "desconhecido";
        this.cheia = false;
    }

    // Métodos Set (modificadores)
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }

    // Métodos Get (assessores)
    public String getMaterial() {
        return material;
    }

    public String getCor() {
        return cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public boolean isCheia() {
        return cheia;
    }

    // Método para alterar a cor da bola (pintar)
    public void pintar(String novaCor) {
        this.cor = novaCor;
        System.out.println("A bola foi pintada de " + novaCor);
    }

    // Método para encher a bola
    public void encher() {
        if (!cheia) {
            this.cheia = true;
            System.out.println("A bola foi enchida.");
        } else {
            System.out.println("A bola já está cheia.");
        }
    }

    // Método para esvaziar a bola
    public void esvaziar() {
        if (cheia) {
            this.cheia = false;
            System.out.println("A bola foi esvaziada.");
        } else {
            System.out.println("A bola já está vazia.");
        }
    }
}
