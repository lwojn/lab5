package urbanizacja;

class Street 
 {
	private:
// Atrybuty:
	int	Numbers;
	String	Name;
	public:
// Getters & Setters:
	
	int	getNumbers() { return Numbers; }
	void	setNumbers(int w) { Numbers = w; }
	
	String	getName() { return Name; }
	void	setName(String w) { Name = w; }
// Operacje:	
	boolean isNumber() {
			return !Numbers.empty();
			// gfdg
		
	}	
	void crossing() {
			Name = "skrzyżowanie"
			// gfdg
		
	}	
	
};
