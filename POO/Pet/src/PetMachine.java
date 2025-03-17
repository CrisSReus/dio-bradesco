public class PetMachine {
    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void takeAShower(){
        if (this.pet == null){
            System.out.println("Coloque o Pet na maquina para iniciar o banho");
            return;
        } 
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de água da maquina está no máximo");
            return;
        }
        water+=2;
    }

    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina está no máximo");
            return;
        }
        shampoo+=2;
    }
    
    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }
    

}
