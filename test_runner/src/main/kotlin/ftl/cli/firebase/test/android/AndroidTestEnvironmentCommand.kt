package ftl.cli.firebase.test.android

import ftl.android.AndroidCatalog.devicesCatalogAsTable
import ftl.android.AndroidCatalog.supportedOrientationsAsTable
import ftl.android.AndroidCatalog.supportedVersionsAsTable
import ftl.args.AndroidArgs
import ftl.config.FtlConstants
import ftl.environment.providedSoftwareAsTable
import ftl.environment.networkConfigurationAsTable
import picocli.CommandLine
import java.nio.file.Paths

@CommandLine.Command(
    name = "test-environment",
    headerHeading = "",
    synopsisHeading = "%n",
    descriptionHeading = "%n@|bold,underline Description:|@%n%n",
    parameterListHeading = "%n@|bold,underline Parameters:|@%n",
    optionListHeading = "%n@|bold,underline Options:|@%n",
    header = ["Print available devices, OS versions, provided software list and network configuration to test against"],
    description = ["Print available Android devices, Android OS versions list, provided software and network configuration to test against"],
    usageHelpAutoWidth = true
)
class AndroidTestEnvironmentCommand : Runnable {
    override fun run() {
        val projectId = AndroidArgs.load(Paths.get(configPath)).project
        println(devicesCatalogAsTable(projectId))
        println(supportedVersionsAsTable(projectId))
        println(providedSoftwareAsTable())
        println(networkConfigurationAsTable())
        println(supportedOrientationsAsTable(projectId))
    }

    @CommandLine.Option(names = ["-c", "--config"], description = ["YAML config file path"])
    var configPath: String = FtlConstants.defaultAndroidConfig

    @CommandLine.Option(names = ["-h", "--help"], usageHelp = true, description = ["Prints this help message"])
    var usageHelpRequested: Boolean = false
}
