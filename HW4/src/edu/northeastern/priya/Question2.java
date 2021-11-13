package edu.northeastern.priya;

public class Question2 {
    class trafficlight {
        private boolean isAGreen = true;
        public trafficlight() {

        }

        public void carArrived(
                int carId,
                int roadId,
                int direction,
                Runnable turnGreen,
                Runnable crossCar
        ) {
            synchronized(this) {
                if ((roadId == 1 && !isAGreen) ||
                        (roadId == 2 && isAGreen)) {
                    isAGreen = !isAGreen;
                    turnGreen.run();
                }
                crossCar.run();
            }
        }
    }
}
