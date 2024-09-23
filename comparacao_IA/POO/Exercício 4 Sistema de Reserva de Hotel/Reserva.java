class Reserva {
    private Quarto quarto;
    private Cliente cliente;
    private String dataCheckIn;
    private String dataCheckOut;

    public Reserva(Quarto quarto, Cliente cliente, String dataCheckIn, String dataCheckOut) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
    }
}