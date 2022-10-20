//########part 1
class Student//1.1
{
    String name;
    String surname;
    int year;
    public Student(String name,String surname,int year)
    {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
}
class library//1.2
{
    String name;
    int count = 0;
    private int area = 100;
    private String arr[] = new String[500];//1.6

    public library(String name)//1.8
    {
        this.name = name;
        System.out.println(this.name);//1.4;
    }

    public void add_book(String book)
    {
        this.arr[this.count] = book;
        this.count++;//1.5
    }
    private void add_journal(String book)//1.3
    {
        this.arr[this.count] = book;//1.6
        this.count++;
    }
    public void setArea(int area)//1.7
    {
        this.area = area;
    }
    public int getArea()//1.7
    {
        return this.area;
    }
}
//########part 1

//########part 2
class growing
{
    private String type_of_grownhimicat = "Diamand";
    int count_of_seeds;//2.1
    int seed_cost;//2.1
    int planting_area;//2.1
    public growing(int count_of_seeds,int planting_area,int seed_cost)//2.2
    {
        this.count_of_seeds = count_of_seeds;
        this.planting_area = planting_area;
        this.seed_cost = seed_cost;
    }
    public void setType_of_grownhimicat(String himicat)//2.1
    {
        this.type_of_grownhimicat = himicat;
    }
    public String getType_of_grownhimicat()
    {
        return this.type_of_grownhimicat;
    }
    public int overall_costofgrowing()
    {
        int cost=0;
        cost = seed_cost*count_of_seeds + planting_area/10;
        return cost;
    }
    public void print_all_inf()
    {
        System.out.println("#########   seed cost = "+ this.seed_cost+ "   #########\n" +"#########   seed's count = "
                + this.count_of_seeds+ "   #########\n"+"#########   planting area = "+this.planting_area+"   v#########\n"
                +"himicat = "+this.type_of_grownhimicat+"   #########\n" +"#########   overall cost = "+this.overall_costofgrowing() +"   #########");
    }


}
//########part 2
public class Main
{

    public static void main(String[] args)
    {
        //########part 1

        Student Andrii = new Student("Andrii","Tivonenko",2004);//1.1
        library Alexsandry = new library("Alexandria");//1.4
        Alexsandry.add_book("Bible");//1.2
        //Alexsandry.add_journal();//1.3
        // Alexsandry.area = 5;   //1.6
        Alexsandry.name = "Alex";//1.5
        Alexsandry.setArea(1000);//1.7
        System.out.println("Alexandria library area = " + Alexsandry.getArea());//1.7
        //########part 1
        //########part 2
        growing Andr = new growing(100,30,1);
        growing Art = new growing(10000,300,1);
        Andr.setType_of_grownhimicat("Strawbery");
        Andr.print_all_inf();//2.4
        Art.print_all_inf();//2.4
        //########part 2




    }
}