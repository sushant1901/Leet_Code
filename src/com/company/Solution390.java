class ParkingSystem {
    int bigLimit, mediumLimit, smallLimit;
    int[] parkingArray;

    public ParkingSystem(int big, int medium, int small) {
        this.bigLimit = big;
        this.mediumLimit = medium;
        
        this.smallLimit = small;
        this.parkingArray = new int[big + medium + small];
        for (int i = 0; i < this.parkingArray.length; i++) {
            this.parkingArray[i] = 0;
        }
    }

    public boolean addCar(int carType) {
        int limit = 0;
        if (carType == 1) {
            limit = this.bigLimit;
        } else if (carType == 2) {
            limit = this.mediumLimit;
        } else {
            limit = this.smallLimit;
        }
        int count = 0;
        for (int i = 0; i < this.parkingArray.length; i++) {
            if (this.parkingArray[i] == carType) {
                count++;
            }
            if (count == limit) {
                return false;
            }
            if (this.parkingArray[i] == 0) {
                this.parkingArray[i] = carType;
                return true;
            }
        }
        return false;
    }
}
