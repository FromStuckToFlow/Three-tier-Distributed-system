package tier3.db.corba;

/**
* tier3/db/corba/ItemDatabaseHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from database.idl
* Monday, 8 December 2014 10:18:02 o'clock CET
*/

public final class ItemDatabaseHolder implements org.omg.CORBA.portable.Streamable
{
  public tier3.db.corba.ItemDatabase value = null;

  public ItemDatabaseHolder ()
  {
  }

  public ItemDatabaseHolder (tier3.db.corba.ItemDatabase initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tier3.db.corba.ItemDatabaseHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tier3.db.corba.ItemDatabaseHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tier3.db.corba.ItemDatabaseHelper.type ();
  }

}
