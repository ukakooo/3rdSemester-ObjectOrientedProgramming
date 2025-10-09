public class Televisi {
    protected String merek;
    protected int jumlahChannel;
    protected int channelAktif;

    public Televisi() {
        
    }

    public void pindahChannel(int channelBaru) {
        this.channelAktif = channelBaru;
    }

    public int getChannelAktif() {
        return channelAktif;
    }
}
