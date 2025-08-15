class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean allDay = false;

        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }

        return allDay;

    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        for (int i = 0; i < Math.min(numberOfDays, birdsPerDay.length); i++) {
            int count = birdsPerDay[i];
            sum += count;
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDay = 0;

        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDay++;
            }
        }

        return busyDay;
    }
}
