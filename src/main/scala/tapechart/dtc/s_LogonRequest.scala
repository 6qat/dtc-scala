package tapechart.dtc

/**
 * Created with IntelliJ IDEA.
 * User: guiga
 * Date: 26/06/14
 * Time: 19:33
 */

object TradeModeEnum extends Enumeration {
  type TradeModeEnum = Value
  val TRADE_MODE_DEMO = Value(1)
  val TRADE_MODE_SIMULATED = Value(2)
  val TRADE_MODE_LIVE = Value(3)
}

class s_LogonRequest {

  import TradeModeEnum._
  import Consts._

  var Size: Short = _
  var Type: Short = _
  var ProtocolVersion: Int = _
  val Username = new Array[Char](32)
  val Password = new Array[Char](32)
  val GeneralTextData = new Array[Char](64)
  var Integer_1: Int = _
  var Integer_2: Int = _
  var HeartbeatIntervalInSeconds: Int = _
  var TradeMode: TradeModeEnum = _
  val TradeAccount = new Array[Char](TRADE_ACCOUNT_LENGTH)
  val HardwareIdentifier = new Array[Char](64)
  val ClientName = new Array[Char](32)

  // Constructor: s_LogonRequest()
  // memset(this, 0,sizeof(s_LogonRequest));
  // Type=LOGON_REQUEST;
  // Size=sizeof(s_LogonRequest);
  ProtocolVersion = CURRENT_VERSION

  def GetMessageSize = Size
  // void CopyFrom(void * p_SourceData);
  def GetProtocolVersion = ProtocolVersion
  def GetUsername = Username
  def SetUsername(u: Array[Char]) = u.copyToArray(Username)

}
