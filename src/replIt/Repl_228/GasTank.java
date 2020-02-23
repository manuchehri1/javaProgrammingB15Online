package replIt.Repl_228;

public class GasTank {
    public double amount =0;
    public double capacity;

    public  GasTank(double capacity){
        this.capacity=capacity;
    }

    @Override
    public String toString() {
        return "GasTank{" +
                "amount=" + amount +
                ", capacity=" + capacity +
                '}';
    }

    public void addGas(double amount) {

            this.amount += + amount;
        if (this.amount>this.capacity){
            this.amount=this.capacity;
        }
    }
        public void useGas( double amount){
            if(amount>0){
                this.amount=this.amount-amount;
            }else{
                this.amount=0;
            }
        }
        public boolean isEmpty(){
            if(this.amount<0.1){
                return true;
            }else{
                return false;
            }
        }

        public boolean isFull(){
            if(amount>capacity-0.1){
                return true;
            }else{
                return false;
            }
        }

        public double getGasLevel(){
            return amount;
        }
        public double fillUp(){
            amount=(capacity-amount);
            return capacity-amount;
        }

    }

