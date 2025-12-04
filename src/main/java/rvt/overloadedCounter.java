package rvt;

public class overloadedCounter {

    
        private int value;

        public overloadedCounter(int startValue) {
            this.value = startValue;
        }

        public overloadedCounter(){
            this.value = 0;
        }

        public int value(){
            return value;
        }

        public void increase(){
            this.value += 1;
        }

        public void deacrease() {
            this.value -= 1;
        }

        public void increase(int increaseBy){
            if (increaseBy >= 0){
                this.value += increaseBy;
            }
        }

        public void deacrease(int deacreaseBy) {
            if (deacreaseBy <= 0){
            this.value -= 1;
            }
        }

}
