package practice4;

class Rectangle extends Shape{

	private int height;
	private int width;
		
	public Rectangle(Color color, int position, int width, int height) 
	{
		
		super(color, position);
		this.width = width;
		this.height = height;
	}
	
	public void draw() 
	{
		
		for (int i = 0; i < height; i++) 
		{
            for (int j = 0; j < width; j++) 
            {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            
            System.out.println();

		}
		
		System.out.println("Rectangle Position: " + position + ", Color: " + color + ", a = " + height + ", b = " + width);
	
	}

}
