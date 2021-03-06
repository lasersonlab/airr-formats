//
// Autogenerated by Thrift Compiler (0.9.3)
//
// DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
//


//HELPER FUNCTIONS AND STRUCTURES

airr.Repository_findCdr3_args = function(args) {
  this.req = null;
  if (args) {
    if (args.req !== undefined && args.req !== null) {
      this.req = new airr.FindCdr3Req(args.req);
    }
  }
};
airr.Repository_findCdr3_args.prototype = {};
airr.Repository_findCdr3_args.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
      if (ftype == Thrift.Type.STRUCT) {
        this.req = new airr.FindCdr3Req();
        this.req.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

airr.Repository_findCdr3_args.prototype.write = function(output) {
  output.writeStructBegin('Repository_findCdr3_args');
  if (this.req !== null && this.req !== undefined) {
    output.writeFieldBegin('req', Thrift.Type.STRUCT, 1);
    this.req.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

airr.Repository_findCdr3_result = function(args) {
  this.success = null;
  if (args) {
    if (args.success !== undefined && args.success !== null) {
      this.success = new airr.FindCdr3Resp(args.success);
    }
  }
};
airr.Repository_findCdr3_result.prototype = {};
airr.Repository_findCdr3_result.prototype.read = function(input) {
  input.readStructBegin();
  while (true)
  {
    var ret = input.readFieldBegin();
    var fname = ret.fname;
    var ftype = ret.ftype;
    var fid = ret.fid;
    if (ftype == Thrift.Type.STOP) {
      break;
    }
    switch (fid)
    {
      case 0:
      if (ftype == Thrift.Type.STRUCT) {
        this.success = new airr.FindCdr3Resp();
        this.success.read(input);
      } else {
        input.skip(ftype);
      }
      break;
      case 0:
        input.skip(ftype);
        break;
      default:
        input.skip(ftype);
    }
    input.readFieldEnd();
  }
  input.readStructEnd();
  return;
};

airr.Repository_findCdr3_result.prototype.write = function(output) {
  output.writeStructBegin('Repository_findCdr3_result');
  if (this.success !== null && this.success !== undefined) {
    output.writeFieldBegin('success', Thrift.Type.STRUCT, 0);
    this.success.write(output);
    output.writeFieldEnd();
  }
  output.writeFieldStop();
  output.writeStructEnd();
  return;
};

airr.RepositoryClient = function(input, output) {
    this.input = input;
    this.output = (!output) ? input : output;
    this.seqid = 0;
};
airr.RepositoryClient.prototype = {};
airr.RepositoryClient.prototype.findCdr3 = function(req, callback) {
  this.send_findCdr3(req, callback); 
  if (!callback) {
    return this.recv_findCdr3();
  }
};

airr.RepositoryClient.prototype.send_findCdr3 = function(req, callback) {
  this.output.writeMessageBegin('findCdr3', Thrift.MessageType.CALL, this.seqid);
  var args = new airr.Repository_findCdr3_args();
  args.req = req;
  args.write(this.output);
  this.output.writeMessageEnd();
  if (callback) {
    var self = this;
    this.output.getTransport().flush(true, function() {
      var result = null;
      try {
        result = self.recv_findCdr3();
      } catch (e) {
        result = e;
      }
      callback(result);
    });
  } else {
    return this.output.getTransport().flush();
  }
};

airr.RepositoryClient.prototype.recv_findCdr3 = function() {
  var ret = this.input.readMessageBegin();
  var fname = ret.fname;
  var mtype = ret.mtype;
  var rseqid = ret.rseqid;
  if (mtype == Thrift.MessageType.EXCEPTION) {
    var x = new Thrift.TApplicationException();
    x.read(this.input);
    this.input.readMessageEnd();
    throw x;
  }
  var result = new airr.Repository_findCdr3_result();
  result.read(this.input);
  this.input.readMessageEnd();

  if (null !== result.success) {
    return result.success;
  }
  throw 'findCdr3 failed: unknown result';
};
