package de.wsdevel.nagios;

/**
 * Created on 10.03.2008.
 * 
 * (c) 2008, Sebastian A. Weiss - All rights reserved.
 * 
 * @author <a href="mailto:post@sebastian-weiss.de">Sebastian A. Weiss</a>
 * @version $Author$ -- $Revision$ -- $Date: 2008-03-11 18:53:54 $
 */
public enum NagiosState {

	/** {@link NagiosState} The CRITICAL. */
	CRITICAL(2),

	/** {@link NagiosState} The OK. */
	OK(0),

	/** {@link NagiosState} The UNKNOWN. */
	UNKNOWN(3),

	/** {@link NagiosState} The WARNING. */
	WARNING(1);

	/**
	 * @param stateVal
	 *            <code>int</code>
	 * @return {@link NagiosState#OK} for state 0, {@link NagiosState#WARNING}
	 *         for state 1, {@link NagiosState#CRITICAL} for state 2 and
	 *         {@link NagiosState#UNKNOWN} for all other values.
	 */
	public final static NagiosState getNagiosStateForState(final int stateVal) {
		switch (stateVal) {
		case 0:
			return OK;
		case 1:
			return WARNING;
		case 2:
			return CRITICAL;
		default:
			return UNKNOWN;
		}

	}

	/** <code>int</code> The state. */
	private int state = 0;

	/**
	 * NagiosState constructor.
	 * 
	 * @param stateVal
	 *            <code>int</code> the state.
	 */
	private NagiosState(final int stateVal) {
		this.state = stateVal;
	}

	/**
	 * @return {@link int} The state.
	 */
	public final int getState() {
		return this.state;
	}
}
//
// $Log$
// Revision 1.1 2009-04-01 11:57:25 sweiss
// added new uistuff
//
// Revision 1.1 2008-03-11 18:53:54 mschneider
// first steps directly talking to flash server via tcp connection
//
//
