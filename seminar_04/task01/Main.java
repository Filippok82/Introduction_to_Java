package seminar_04.task01;

class Main {

    public static void main(String[] args) {
        Worker manager = new Worker("worker1", Worker.Status.Manager);
        Worker head = new Worker("worker1", Worker.Status.Head);
        Worker general = new Worker("worker3", Worker.Status.General);
        Client client1 = new Client("first1", "last1", "01.12.1985", "12345687", "999999999");

        client1.getInfoBy(general);
    }

}
