#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#
require 5.6.0;
use strict;
use warnings;
use Thrift;

use airr::Types;

# HELPER FUNCTIONS AND STRUCTURES

package airr::Repository_findCdr3_args;
use base qw(Class::Accessor);
airr::Repository_findCdr3_args->mk_accessors( qw( req ) );

sub new {
  my $classname = shift;
  my $self      = {};
  my $vals      = shift || {};
  $self->{req} = undef;
  if (UNIVERSAL::isa($vals,'HASH')) {
    if (defined $vals->{req}) {
      $self->{req} = $vals->{req};
    }
  }
  return bless ($self, $classname);
}

sub getName {
  return 'Repository_findCdr3_args';
}

sub read {
  my ($self, $input) = @_;
  my $xfer  = 0;
  my $fname;
  my $ftype = 0;
  my $fid   = 0;
  $xfer += $input->readStructBegin(\$fname);
  while (1) 
  {
    $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
    if ($ftype == TType::STOP) {
      last;
    }
    SWITCH: for($fid)
    {
      /^1$/ && do{      if ($ftype == TType::STRUCT) {
        $self->{req} = new airr::FindCdr3Req();
        $xfer += $self->{req}->read($input);
      } else {
        $xfer += $input->skip($ftype);
      }
      last; };
        $xfer += $input->skip($ftype);
    }
    $xfer += $input->readFieldEnd();
  }
  $xfer += $input->readStructEnd();
  return $xfer;
}

sub write {
  my ($self, $output) = @_;
  my $xfer   = 0;
  $xfer += $output->writeStructBegin('Repository_findCdr3_args');
  if (defined $self->{req}) {
    $xfer += $output->writeFieldBegin('req', TType::STRUCT, 1);
    $xfer += $self->{req}->write($output);
    $xfer += $output->writeFieldEnd();
  }
  $xfer += $output->writeFieldStop();
  $xfer += $output->writeStructEnd();
  return $xfer;
}

package airr::Repository_findCdr3_result;
use base qw(Class::Accessor);
airr::Repository_findCdr3_result->mk_accessors( qw( success ) );

sub new {
  my $classname = shift;
  my $self      = {};
  my $vals      = shift || {};
  $self->{success} = undef;
  if (UNIVERSAL::isa($vals,'HASH')) {
    if (defined $vals->{success}) {
      $self->{success} = $vals->{success};
    }
  }
  return bless ($self, $classname);
}

sub getName {
  return 'Repository_findCdr3_result';
}

sub read {
  my ($self, $input) = @_;
  my $xfer  = 0;
  my $fname;
  my $ftype = 0;
  my $fid   = 0;
  $xfer += $input->readStructBegin(\$fname);
  while (1) 
  {
    $xfer += $input->readFieldBegin(\$fname, \$ftype, \$fid);
    if ($ftype == TType::STOP) {
      last;
    }
    SWITCH: for($fid)
    {
      /^0$/ && do{      if ($ftype == TType::STRUCT) {
        $self->{success} = new airr::FindCdr3Resp();
        $xfer += $self->{success}->read($input);
      } else {
        $xfer += $input->skip($ftype);
      }
      last; };
        $xfer += $input->skip($ftype);
    }
    $xfer += $input->readFieldEnd();
  }
  $xfer += $input->readStructEnd();
  return $xfer;
}

sub write {
  my ($self, $output) = @_;
  my $xfer   = 0;
  $xfer += $output->writeStructBegin('Repository_findCdr3_result');
  if (defined $self->{success}) {
    $xfer += $output->writeFieldBegin('success', TType::STRUCT, 0);
    $xfer += $self->{success}->write($output);
    $xfer += $output->writeFieldEnd();
  }
  $xfer += $output->writeFieldStop();
  $xfer += $output->writeStructEnd();
  return $xfer;
}

package airr::RepositoryIf;

use strict;


sub findCdr3{
  my $self = shift;
  my $req = shift;

  die 'implement interface';
}

package airr::RepositoryRest;

use strict;


sub new {
  my ($classname, $impl) = @_;
  my $self     ={ impl => $impl };

  return bless($self,$classname);
}

sub findCdr3{
  my ($self, $request) = @_;

  my $req = ($request->{'req'}) ? $request->{'req'} : undef;
  return $self->{impl}->findCdr3($req);
}

package airr::RepositoryClient;


use base qw(airr::RepositoryIf);
sub new {
  my ($classname, $input, $output) = @_;
  my $self      = {};
  $self->{input}  = $input;
  $self->{output} = defined $output ? $output : $input;
  $self->{seqid}  = 0;
  return bless($self,$classname);
}

sub findCdr3{
  my $self = shift;
  my $req = shift;

    $self->send_findCdr3($req);
  return $self->recv_findCdr3();
}

sub send_findCdr3{
  my $self = shift;
  my $req = shift;

  $self->{output}->writeMessageBegin('findCdr3', TMessageType::CALL, $self->{seqid});
  my $args = new airr::Repository_findCdr3_args();
  $args->{req} = $req;
  $args->write($self->{output});
  $self->{output}->writeMessageEnd();
  $self->{output}->getTransport()->flush();
}

sub recv_findCdr3{
  my $self = shift;

  my $rseqid = 0;
  my $fname;
  my $mtype = 0;

  $self->{input}->readMessageBegin(\$fname, \$mtype, \$rseqid);
  if ($mtype == TMessageType::EXCEPTION) {
    my $x = new TApplicationException();
    $x->read($self->{input});
    $self->{input}->readMessageEnd();
    die $x;
  }
  my $result = new airr::Repository_findCdr3_result();
  $result->read($self->{input});
  $self->{input}->readMessageEnd();

  if (defined $result->{success} ) {
    return $result->{success};
  }
  die "findCdr3 failed: unknown result";
}
package airr::RepositoryProcessor;

use strict;


sub new {
    my ($classname, $handler) = @_;
    my $self      = {};
    $self->{handler} = $handler;
    return bless ($self, $classname);
}

sub process {
    my ($self, $input, $output) = @_;
    my $rseqid = 0;
    my $fname  = undef;
    my $mtype  = 0;

    $input->readMessageBegin(\$fname, \$mtype, \$rseqid);
    my $methodname = 'process_'.$fname;
    if (!$self->can($methodname)) {
      $input->skip(TType::STRUCT);
      $input->readMessageEnd();
      my $x = new TApplicationException('Function '.$fname.' not implemented.', TApplicationException::UNKNOWN_METHOD);
      $output->writeMessageBegin($fname, TMessageType::EXCEPTION, $rseqid);
      $x->write($output);
      $output->writeMessageEnd();
      $output->getTransport()->flush();
      return;
    }
    $self->$methodname($rseqid, $input, $output);
    return 1;
}

sub process_findCdr3 {
    my ($self, $seqid, $input, $output) = @_;
    my $args = new airr::Repository_findCdr3_args();
    $args->read($input);
    $input->readMessageEnd();
    my $result = new airr::Repository_findCdr3_result();
    $result->{success} = $self->{handler}->findCdr3($args->req);
    $output->writeMessageBegin('findCdr3', TMessageType::REPLY, $seqid);
    $result->write($output);
    $output->writeMessageEnd();
    $output->getTransport()->flush();
}

1;
