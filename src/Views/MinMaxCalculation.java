import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class MinMaxCalculation {

    static public MinView createMin() {
        return new MinView();
    }

    static public MaxView createMax() {
        return new MaxView();
    }
}

class MinView implements View{
    double mini;
    JTextField jtfMin;
    String minname;

    public MinView() {
        mini = 0;
        jtfMin = new JTextField(5);
		jtfMin.setEditable(false);
        minname = "Min";
    }

    @Override
	public void update(ArrayList<Double> numbers) {
        mini = Collections.min(numbers);
	

    //Set text
    jtfMin.setText("" + mini);
	}

	@Override
	public void reset() {
		jtfMin.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfMin;
	}

	@Override
	public String getName() {
		return minname;
	}

	public double getMin() {
		return mini;
	}
}

class MaxView implements View{

    double maxi;
    JTextField jtfMax;
    String maxname;

    public MaxView() {
        maxi = 0;
        jtfMax = new JTextField(6);
		jtfMax.setEditable(false);
        maxname = "Max";
    }

    @Override
	public void update(ArrayList<Double> numbers) {
        maxi = Collections.max(numbers);
	

    //Set text
    jtfMax.setText("" + maxi);
	}

	@Override
	public void reset() {
		jtfMax.setText("");
	}

	@Override
	public JTextComponent show() {
		return jtfMax;
	}

	@Override
	public String getName() {
		return maxname;
	}

	public double getMin() {
		return maxi;
	}
}
