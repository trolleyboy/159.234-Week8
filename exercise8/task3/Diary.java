package exercise8.task3;

import java.util.Set;
import java.util.TreeMap;
import java.time.LocalDateTime;

public class Diary {
    private TreeMap<LocalDateTime, String> appointmentSlots = new TreeMap<LocalDateTime, String>();

    public void makeAppointment(String name, int year, int month, int day, int hour, int minute) {
        LocalDateTime key = LocalDateTime.of(year, month, day, hour, minute);
        appointmentSlots.put(key, name);
    }

    public void removeAppointment(int year, int month, int day, int hour, int minute) {
        LocalDateTime key = LocalDateTime.of(year, month, day, hour, minute);
        if (appointmentSlots.containsKey(key)) {
            String name = appointmentSlots.get(key);
            appointmentSlots.remove(key);
            System.out.println("Removed appointment: " + key + " with " + name);
            System.out.println("");
        } else {
            System.out.println("No appointment found.");
        }
    }

    public void showAppointments() {
        String currentName;
        Set<LocalDateTime> appointments = appointmentSlots.keySet();
        for (LocalDateTime dateTime : appointments) {
            currentName = appointmentSlots.get(dateTime);
            System.out.println(currentName +
                    " has an appointment on " + dateTime.getDayOfMonth()
                    + " " + dateTime.getMonth() + " "
                    + dateTime.getYear()
                    + " at " + dateTime.getHour() + ":"
                    + dateTime.getMinute());
        }
        System.out.println("");
    }

    public void findAppointmentByDateTime(int year, int month, int day, int hour, int minute) {
        LocalDateTime key = LocalDateTime.of(year, month, day, hour, minute);
        if (appointmentSlots.containsKey(key)) {
            String currentName;
            currentName = appointmentSlots.get(key);
            System.out.println(currentName +
                    " has an appointment on " + key.getDayOfMonth()
                    + " " + key.getMonth() + " "
                    + key.getYear()
                    + " at " + key.getHour() + ":"
                    + key.getMinute());
        } else {
            System.out.println("No appointment found.");
        }
    }

    public static void main(String[] args) {
        // create a Diary object
        Diary diary = new Diary();
        // add three appointments to the diary
        diary.makeAppointment("Great King of Terror",  1999,  7,  1,  10,  30);
        diary.makeAppointment("Santa Claus",  2020,  12,  24,  23,  59);
        diary.makeAppointment("Neville Chamberlain",  1938,  9,  28,  12,  0);

        // display the appointments in the diary
        diary.showAppointments();

        diary.removeAppointment(1999, 7, 1, 10, 30);
        diary.showAppointments();

        diary.findAppointmentByDateTime(1938,  9,  28,  12,  0);
    }
}
