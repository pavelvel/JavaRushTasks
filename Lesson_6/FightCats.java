package JavaRushTask.JR_6;

public class FightCats {
    public int age;
    public int weight;
    public int strength;
   static  int count=0;

    public FightCats(int age, int weight, int strength) {
        this.age=age;
        this.weight=weight;
        this.strength=strength;
    }

    public boolean fight(FightCats anotherCat) {
        if(this.age>anotherCat.age)count++;
        else if (this.age<anotherCat.age)count--;

        if(this.weight>anotherCat.weight)count++;
        else if  (this.weight<anotherCat.weight) count--;


        if(this.strength>anotherCat.strength)count++;
        else if (this.strength<anotherCat.strength) count--;

        if (count>=0) return true;
        else  return false;


    }

    public static void main(String[] args) {
        FightCats cat1=new FightCats(3,3, 6);
        FightCats cat2=new FightCats(5,5,6);
        System.out.println(cat1.fight(cat2));

    }
}


