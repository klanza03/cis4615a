
// Rule 14. Serialization (SER)
// Example: SER06-J: Make defensive copies of private mutable components during deserialization

class MutableSer implements Serializable {
    private static final Date epoch = new Date(0);
    private Date date = null; // Mutable component
     
    public MutableSer(Date d){
      date = new Date(d.getTime()); // Constructor performs defensive copying
    }
   
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
      ois.defaultReadObject();
      // Perform validation if necessary
    }
  }

