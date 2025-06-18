package kadai3;


public abstract class Character2 {
     String name;
    int hp;

    public abstract void attack(Matango2 m);
    public void run() {
        System.out.println(this.name + "は逃げ出した。");
        }
    }
