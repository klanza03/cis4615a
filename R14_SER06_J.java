
// Rule 14. Serialization (SER)
// Example: SER06-J: Make defensive copies of private mutable components during deserialization

private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
    ObjectInputStream.GetField fields = ois.readFields();
    Date inDate = (Date) fields.get("date", epoch);
    // Defensively copy the mutable component
    date = new Date(inDate.getTime());
    // Perform validation if necessary
  }

