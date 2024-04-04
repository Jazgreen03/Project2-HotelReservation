package HotelDatabase;
import javax.swing.*;

public class HotelReservationSystem extends JFrame {
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JLabel CustomerNameLabel, roomTypeLabel, arrivalLabel, departureLabel;
	    private JTextField nameField, arrivalField, departureField;
	    private JComboBox<String> roomTypeComboBox;
	    private JButton submitButton;

	     public HotelReservationSystem() {
	        setTitle("ABC Hotel Booking System");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        CustomerNameLabel = new JLabel("Customer Name:");
	        nameField = new JTextField(20);

	        roomTypeLabel = new JLabel("Room Type:");
	        String[] roomTypes = {"Regular Room", "Deluxe Room", "Junior Suite"};
	        roomTypeComboBox = new JComboBox<>(roomTypes);

	        arrivalLabel = new JLabel("Arrival Date:");
	        arrivalField = new JTextField(10);

	        departureLabel = new JLabel("Departure Date:");
	        departureField = new JTextField(10);

	        submitButton = new JButton("Submit");
	        submitButton.addActionListener(e -> submitBooking());

	        JPanel panel = new JPanel();
	        panel.add(CustomerNameLabel);
	        panel.add(nameField);
	        panel.add(roomTypeLabel);
	        panel.add(roomTypeComboBox);
	        panel.add(arrivalLabel);
	        panel.add(arrivalField);
	        panel.add(departureLabel);
	        panel.add(departureField);
	        panel.add(submitButton);

	        add(panel);
	        setVisible(true);
	    }


}
