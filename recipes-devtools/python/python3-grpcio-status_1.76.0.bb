DESCRIPTION = "Status proto mapping for gRPC"
HOMEPAGE = "http://www.grpc.io/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=731e401b36f8077ae0c134b59be5c906"

inherit pypi python_setuptools_build_meta

RDEPENDS:${PN} = "python3-grpcio"

SRC_URI[sha256sum] = "25fcbfec74c15d1a1cb5da3fab8ee9672852dc16a5a9eeb5baf7d7a9952943cd"

BBCLASSEXTEND = "native nativesdk"

PYPI_PACKAGE = "grpcio_status"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
