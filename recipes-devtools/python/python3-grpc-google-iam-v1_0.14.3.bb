DESCRIPTION = "GRPC library for the google-iam-v1 service"
HOMEPAGE = "https://github.com/googleapis/googleapis"
AUTHOR = "Google Inc"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

inherit pypi python_setuptools_build_meta

PR = "r0"

RDEPENDS:${PN} += "\
    python3-googleapis-common-protos \
    python3-grpcio \
"

SRC_URI[sha256sum] = "879ac4ef33136c5491a6300e27575a9ec760f6cdf9a2518798c1b8977a5dc389"

PYPI_PACKAGE = "grpc_google_iam_v1"
UPSTREAM_CHECK_PYPI_PACKAGE = "${PYPI_PACKAGE}"
