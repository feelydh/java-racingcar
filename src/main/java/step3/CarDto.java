package step3;


public class CarDto {

    private int position;
    private int executeNumber;
    private String name;

    public CarDto(){
        this.position = 0;
    }

    public int getPosition(){
        return this.position;
    }

    public void setUpdatePosition(int update) {
        if(executeNumber == 0){
            update = 1;
            executeNumber++;
        }
        this.position += update;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
