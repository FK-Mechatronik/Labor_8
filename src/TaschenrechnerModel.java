import java.text.DecimalFormat;

public class TaschenrechnerModel {
    private double ersterOperant;
    private double zweiterOperant;
    private String operator;


    public double getErgebnis(){

        try{
            switch (this.operator) {
                case "+":
                    return this.ersterOperant + this.zweiterOperant;
                case "-":
                    return this.ersterOperant - this.zweiterOperant;
                case "*":
                    return this.ersterOperant * this.zweiterOperant;
                case "/":
                    return this.ersterOperant / this.zweiterOperant;
                default:
                    return this.zweiterOperant;
                }
            }catch (NullPointerException e){
                return this.zweiterOperant;
        }



    }

    public void zurücksetzen(){
        this.operator=null;
    }

    public void setErsterOperant(double ersterOperant) {
        this.ersterOperant = ersterOperant;
    }

    public void setZweiterOperant(double zweiterOperant) {
        this.zweiterOperant = zweiterOperant;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


    public static void main(String[] args) {
        TaschenrechnerModel model = new TaschenrechnerModel();
        model.setErsterOperant(29);
        model.setZweiterOperant(18);
        model.setOperator("+");
        System.out.println(model.getErgebnis());

        model.setOperator("-");
        System.out.println(model.getErgebnis());

        model.zurücksetzen();
        System.out.println(model.getErgebnis());
    }

}
