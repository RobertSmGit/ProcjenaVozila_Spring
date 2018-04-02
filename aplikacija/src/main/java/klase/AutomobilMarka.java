package klase;

public class AutomobilMarka {
	
		
		private int id;
		private Integer markaId;
		private String marka;

		public AutomobilMarka(int id, String marka, int markaId){
			this.id=id;
			this.marka=marka;
			this.markaId = markaId;
		}


		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}


		public Integer getMarkaId() {
			return markaId;
		}

		public void setMarkaId(Integer markaId) {
			this.markaId = markaId;
		}


		public String getMarka() {
			return marka;
		}

		public void setMarka(String marka) {
			this.marka = marka;
		}


}
