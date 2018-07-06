/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgbcolortohexconverter;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

  public class JNumberTextField extends JTextField {

        private static final long serialVersionUID = 1L;

        /**
         * A {@link JTextField} that skips all non-digit keys. The user is only
         * able to enter numbers.
         *
         * @author Michi Gysel <michi@scythe.ch>
         * A Little modification by me
         * @param ev
         */
        @Override
        public void processKeyEvent(KeyEvent ev) {
            if (Character.isDigit(ev.getKeyChar()) || ev.getKeyCode() == 127 || ev.getKeyCode() == 8) {
                super.processKeyEvent(ev);
            }
            ev.consume();
            return;
        }

        /**
         * As the user is not even able to enter a dot ("."), only integers
         * (whole numbers) may be entered.
         * @return 
         */
        public Long getNumber() {
            Long result = null;
            String text = getText();
            if (text != null && !"".equals(text)) {
                result = Long.valueOf(text);
            }
            return result;
        }
    }
