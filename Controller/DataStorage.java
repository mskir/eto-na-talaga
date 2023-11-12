package Controller;


    public class DataStorage {
        private static String selectedSeat;
        private static String selectedTime;
    
        public static String getSelectedSeat() {
            return selectedSeat;
        }
    
        public static void setSelectedSeat(String selectedSeat) {
            DataStorage.selectedSeat = selectedSeat;
        }
    
        public static String getSelectedTime() {
            return selectedTime;
        }
    
        public static void setSelectedTime(String selectedTime) {
            DataStorage.selectedTime = selectedTime;
        }
    }

