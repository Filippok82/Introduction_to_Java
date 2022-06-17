package seminar_04.task01;

class Worker {
    enum Status {
        Manager,
        Head,
        General
    }

    private String name;
    private Status status;

    Worker(String name,Status status) {
        this.name = name;
        this.status = status;
    }
    public Status getStatus(){
        return this.status;
    }
}
