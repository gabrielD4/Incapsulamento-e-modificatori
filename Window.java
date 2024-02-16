public class Window {

    private String colore;

    private int prezzo;

    public Window(String colore, int prezzo) {
        this.colore = colore;
        this.prezzo = prezzo;
    }
    public String getColore() {
        return this.colore;
    }
    public int getPrezzo() {
        return this.prezzo;
    }

    private void setColore(String colore) {
        this.colore = colore;
    }

    private void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
