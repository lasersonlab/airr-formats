/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef Repository_H
#define Repository_H

#include <thrift/TDispatchProcessor.h>
#include <thrift/async/TConcurrentClientSyncInfo.h>
#include "airr_types.h"

namespace airr {

#ifdef _WIN32
  #pragma warning( push )
  #pragma warning (disable : 4250 ) //inheriting methods via dominance 
#endif

class RepositoryIf {
 public:
  virtual ~RepositoryIf() {}
  virtual void findCdr3(FindCdr3Resp& _return, const FindCdr3Req& req) = 0;
};

class RepositoryIfFactory {
 public:
  typedef RepositoryIf Handler;

  virtual ~RepositoryIfFactory() {}

  virtual RepositoryIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(RepositoryIf* /* handler */) = 0;
};

class RepositoryIfSingletonFactory : virtual public RepositoryIfFactory {
 public:
  RepositoryIfSingletonFactory(const boost::shared_ptr<RepositoryIf>& iface) : iface_(iface) {}
  virtual ~RepositoryIfSingletonFactory() {}

  virtual RepositoryIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(RepositoryIf* /* handler */) {}

 protected:
  boost::shared_ptr<RepositoryIf> iface_;
};

class RepositoryNull : virtual public RepositoryIf {
 public:
  virtual ~RepositoryNull() {}
  void findCdr3(FindCdr3Resp& /* _return */, const FindCdr3Req& /* req */) {
    return;
  }
};

typedef struct _Repository_findCdr3_args__isset {
  _Repository_findCdr3_args__isset() : req(false) {}
  bool req :1;
} _Repository_findCdr3_args__isset;

class Repository_findCdr3_args {
 public:

  Repository_findCdr3_args(const Repository_findCdr3_args&);
  Repository_findCdr3_args& operator=(const Repository_findCdr3_args&);
  Repository_findCdr3_args() {
  }

  virtual ~Repository_findCdr3_args() throw();
  FindCdr3Req req;

  _Repository_findCdr3_args__isset __isset;

  void __set_req(const FindCdr3Req& val);

  bool operator == (const Repository_findCdr3_args & rhs) const
  {
    if (!(req == rhs.req))
      return false;
    return true;
  }
  bool operator != (const Repository_findCdr3_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Repository_findCdr3_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class Repository_findCdr3_pargs {
 public:


  virtual ~Repository_findCdr3_pargs() throw();
  const FindCdr3Req* req;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _Repository_findCdr3_result__isset {
  _Repository_findCdr3_result__isset() : success(false) {}
  bool success :1;
} _Repository_findCdr3_result__isset;

class Repository_findCdr3_result {
 public:

  Repository_findCdr3_result(const Repository_findCdr3_result&);
  Repository_findCdr3_result& operator=(const Repository_findCdr3_result&);
  Repository_findCdr3_result() {
  }

  virtual ~Repository_findCdr3_result() throw();
  FindCdr3Resp success;

  _Repository_findCdr3_result__isset __isset;

  void __set_success(const FindCdr3Resp& val);

  bool operator == (const Repository_findCdr3_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    return true;
  }
  bool operator != (const Repository_findCdr3_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const Repository_findCdr3_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _Repository_findCdr3_presult__isset {
  _Repository_findCdr3_presult__isset() : success(false) {}
  bool success :1;
} _Repository_findCdr3_presult__isset;

class Repository_findCdr3_presult {
 public:


  virtual ~Repository_findCdr3_presult() throw();
  FindCdr3Resp* success;

  _Repository_findCdr3_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class RepositoryClient : virtual public RepositoryIf {
 public:
  RepositoryClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  RepositoryClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void findCdr3(FindCdr3Resp& _return, const FindCdr3Req& req);
  void send_findCdr3(const FindCdr3Req& req);
  void recv_findCdr3(FindCdr3Resp& _return);
 protected:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class RepositoryProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  boost::shared_ptr<RepositoryIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (RepositoryProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_findCdr3(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  RepositoryProcessor(boost::shared_ptr<RepositoryIf> iface) :
    iface_(iface) {
    processMap_["findCdr3"] = &RepositoryProcessor::process_findCdr3;
  }

  virtual ~RepositoryProcessor() {}
};

class RepositoryProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  RepositoryProcessorFactory(const ::boost::shared_ptr< RepositoryIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::boost::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::boost::shared_ptr< RepositoryIfFactory > handlerFactory_;
};

class RepositoryMultiface : virtual public RepositoryIf {
 public:
  RepositoryMultiface(std::vector<boost::shared_ptr<RepositoryIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~RepositoryMultiface() {}
 protected:
  std::vector<boost::shared_ptr<RepositoryIf> > ifaces_;
  RepositoryMultiface() {}
  void add(boost::shared_ptr<RepositoryIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  void findCdr3(FindCdr3Resp& _return, const FindCdr3Req& req) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->findCdr3(_return, req);
    }
    ifaces_[i]->findCdr3(_return, req);
    return;
  }

};

// The 'concurrent' client is a thread safe client that correctly handles
// out of order responses.  It is slower than the regular client, so should
// only be used when you need to share a connection among multiple threads
class RepositoryConcurrentClient : virtual public RepositoryIf {
 public:
  RepositoryConcurrentClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  RepositoryConcurrentClient(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(boost::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, boost::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void findCdr3(FindCdr3Resp& _return, const FindCdr3Req& req);
  int32_t send_findCdr3(const FindCdr3Req& req);
  void recv_findCdr3(FindCdr3Resp& _return, const int32_t seqid);
 protected:
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  boost::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
  ::apache::thrift::async::TConcurrentClientSyncInfo sync_;
};

#ifdef _WIN32
  #pragma warning( pop )
#endif

} // namespace

#endif
