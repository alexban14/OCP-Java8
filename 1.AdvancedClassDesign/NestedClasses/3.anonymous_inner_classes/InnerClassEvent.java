public class InnerClassEvent {
    JButton button = new JButton("red");

    button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            // handle the button click
        }
    }); 
}
