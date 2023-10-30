package Caine;

public class Caine {
    String nume;
    String rasa;

    public Caine(String nume, String rasa) {
        this.nume = nume;
        this.rasa = rasa;
    }

    public static void main(String[] args){
        Caine caine = new Caine("Simba", "Akita American");
        System.out.println(caine.nume + " " + caine.rasa);
    }

}
