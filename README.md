`airr-formats`
==============

This repo contains an example Thrift IDL file for what the AIRR spec can look
like.

The main file to look at is `airr.thrift`, which contains a toy data model and
a toy interface (at the bottom) to specify what the repository interface could
look like.

For the Minimum Standards Working Group, this file could be used in place of
the Google Spreadsheet to define the fields and insert comments that can
autogenerated into documentation.  This would allow public comment/suggestions
and also provide version control and history of changes.

For the Common Repository Working Group, this file can define the interface of
an "AIRR-compliant" repository, also available for public participation.  This
would also function as an interface between the working groups.

An example project to compare would be the GA4GH project, which is attempting a
very similar effort focused on human genome sequencing.  There is some overlap
in their data model, which can be seen here:

https://github.com/ga4gh/schemas

The GA4GH Beacon project defines an API for some specific queries that are
supported by "Beacon-compliant" variant repositories:

https://github.com/ga4gh/beacon-team

This repo uses Apache Thrift to define data/interfaces, as it provides a good
combination of performance, readability, flexibility, and language support.  It
has a vibrant developer community across many industries, and is widely used by
companies that process large quantities of data (e.g., Twitter).

As another example, I have included a Thrift version of vdjserver's `vdjml.xsd`
as `vdjml.thrift`.

The main advantages of using a system such as this are:

* Machine-readable spec for data types and interfaces
* The spec is also easily human-readable, compared to, e.g., XML specs
* The specs can be compiled into code for many languages, including Python,
  C/C++, Java, Scala, Javascript, Perl, etc.
* Thrift includes high-performance binary implementations for serialization
  and also supports JSON
* Thrift is compatible with the columnar Parquet file format for very
  high-performance queries among other file formats (including JSON)
* Thrift support schema evolution, allowing the schemas to change without
  breaking any code.  Code can automatically support multiple versions of the
  data formats
* The Thrift compiler auto-generates a server interface that can be easily
  implemented in multiple languages
* The Thrift project is widely used and heavily maintained by a large
  open-source community

Using Thrift for defining our formats/interfaces essentially completely
eliminates the need for defining custom file formats, and eliminates the need
for implementing custom serialization code.

Furthermore, the implementations in different languages are all required to be
binary-compatible with each other.  So an AIRR repository server could be, for
example, implemented in C++, and a client that connects to the server could be
implemented in Python.  In both cases, the serialization code to match the data
models is automatically generated and everything should be interoperable.

See a usage example for Python here:

https://thrift.apache.org/tutorial/py

The commands to generate the Thrift code in this repo are:

```
thrift --gen py:new_style airr.thrift
thrift --gen cpp airr.thrift
thrift --gen java airr.thrift
thrift --gen perl airr.thrift
thrift --gen js airr.thrift
thrift --gen json airr.thrift

thrift --gen py:new_style vdjml.thrift
thrift --gen cpp vdjml.thrift
thrift --gen java vdjml.thrift
thrift --gen perl vdjml.thrift
thrift --gen js vdjml.thrift
thrift --gen json vdjml.thrift
```

Other languages are available.  Execute `thrift -help` for the list.

Notice all the `gen-*` directories, which contain packages in different
languages for reading/writing the data types, along with a server stub for the
AIRR schema.
