class Twofer {
	private final static String YOU = "you";
	private final static String MESSAGE = "One for %s, one for me.";
	
	
	
    String twofer(String name) {		
        if (name == null || name.isEmpty()) {
			name = YOU;
		}
		return String.format(MESSAGE, name);
    }
}
