
class EuropeanSocket {
    public String plugIn() {
        return "Powering with European socket.";
    }
}


class USToEuropeanAdapter {
    private EuropeanSocket europeanSocket;

    public USToEuropeanAdapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    public String plugIn() {
        return europeanSocket.plugIn();
    }
}


public class Adapter_pattern {
    public static void main(String[] args) {
        EuropeanSocket europeanSocket = new EuropeanSocket();
        USToEuropeanAdapter adapter = new USToEuropeanAdapter(europeanSocket);
        System.out.println(adapter.plugIn());
    }
}

