
public class foodRestarunt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kfc k1=new Kfc();
		k1.setKfc(101, "pizza", 250);
		k1.toString();
		System.out.println("your order detils are:"+k1);
		
		McDonaldscollDrink mD1=new McDonaldscollDrink();
		mD1.setMcDonaldscollDrink(102, "burger", 50, "sprite");
		mD1.toString();
		System.out.println("your order detils are:"+mD1);

		
		
	}
}
	
	class Kfc
	{
		int orderno;
		String selectItem;
		float itemRate;
		public void setKfc(int orderno, String selectItem, float itemRate) {
			this.orderno = orderno;
			this.selectItem = selectItem;
			this.itemRate = itemRate;
		}
		public int getOrderno() {
			return orderno;
		}
		public void setOrderno(int orderno) {
			this.orderno = orderno;
		}
		public String getSelectItem() {
			return selectItem;
		}
		public void setSelectItem(String selectItem) {
			this.selectItem = selectItem;
		}
		public float getItemRate() {
			return itemRate;
		}
		public void setItemRate(float itemRate) {
			this.itemRate = itemRate;
		}
		@Override
		public String toString() {
			return "Kfc [orderno=" + orderno + ", selectItem=" + selectItem + ", itemRate=" + itemRate + "]";
		}
		
		
	}	
	
		class McDonaldscollDrink extends Kfc
		{
			String item2;

			public void setMcDonaldscollDrink(int orderno, String selectItem, float itemRate,String item2) {
				super.setKfc(orderno, selectItem, itemRate);
				this.item2 = item2;
			}

			public String getItem2() {
				return item2;
			}

			@Override
			public String toString() {
				return "McDonaldscollDrink [orderno=" + orderno + ", selectItem=" + selectItem + ", itemRate="
						+ itemRate + ", item2=" + item2 + "]";
			}
				
			
		}
		