package glab303_9_1;

public class HumanBeing
{
    private float weight;
    private float height;
    private float bmi;

    public HumanBeing(float weight, float height, float bmi)
    {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;

    }
    public HumanBeing()
    {

    }
    public float getWeight(){
        return weight;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }
    public float getHeight(){
        return height;
    }
    public void setHight(float height){
         this.height = height;
    }
    public float getBmi(){
        return bmi;
    }
    public void setBmi(float bmi){
        this.bmi = bmi;
    }
}
