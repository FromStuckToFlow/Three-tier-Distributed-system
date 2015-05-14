package tier3.db.corba;


/**
* tier3/db/corba/_ItemDatabaseStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from database.idl
* Monday, 8 December 2014 10:18:02 o'clock CET
*/

public class _ItemDatabaseStub extends org.omg.CORBA.portable.ObjectImpl implements tier3.db.corba.ItemDatabase
{

  public String[] getLocations (int id, int amount)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLocations", true);
                $out.write_long (id);
                $out.write_long (amount);
                $in = _invoke ($out);
                String $result[] = tier3.db.corba.ItemDatabasePackage.StrArrHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLocations (id, amount        );
            } finally {
                _releaseReply ($in);
            }
  } // getLocations

  public boolean stored (int id, int amount, String location)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("stored", true);
                $out.write_long (id);
                $out.write_long (amount);
                $out.write_string (location);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return stored (id, amount, location        );
            } finally {
                _releaseReply ($in);
            }
  } // stored

  public int countItems (int id, String location)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("countItems", true);
                $out.write_long (id);
                $out.write_string (location);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return countItems (id, location        );
            } finally {
                _releaseReply ($in);
            }
  } // countItems

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:tier3/db/corba/ItemDatabase:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ItemDatabaseStub
