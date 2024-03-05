package labAssignment;


import java.util.Scanner;

public class laptop {
    private String model;
    private String company;
    private double weight;


     laptop(String model, String company, double weight){
         this.model = model;
         this.company = company;
         this.weight = weight;
     }
      public void printData(){
         System.out.println("Model:"+model+"      "+"Company:"+company+"      "+"Weight:"+weight);
     }


     String getModel(){
         return model;
     }

    String getCompany(){
        return company;
    }


    double getWeight(){
        return weight;
    }

    void setModel(String model){
        this.model = model;
    }

    void setCompany(String company){
        this.company = company;
    }

    void setWeight(double weight){
        this.weight = weight;
    }


}




class Fix{
    public static void main(String[] args) {
        System.out.println("Enter the total number of laptops :");

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        laptop[] l = new laptop[size];
        if (size < 5) {                      //as said at least 5 laptops//
            System.out.println("Invalid Input!");
            return;
        }
        for (int i = 0; i < size; i++) {

            System.out.println("Enter model company weight:");
            sc.nextLine();
            String model = sc.nextLine();
            String company = sc.nextLine();
            double weight = sc.nextDouble();

            l[i] = new laptop(model, company, weight);

        }


        for (laptop lp : l) {
            lp.printData();


        }
    }
}